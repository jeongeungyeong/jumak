package com.example.jumak.controller.user;

import com.example.jumak.domain.dto.user.UserDto;
import com.example.jumak.service.user.UserService;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpSession;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.view.RedirectView;

@Controller
@RequiredArgsConstructor
@RequestMapping("/user")
public class UserController {
 private final UserService userService;

// 단순페이지 이동 처리
    @GetMapping("/join/agree")
    public String joinAgree(){
        return "user/join/join-agree";
    }

    @GetMapping("/joinInfo")
    public String joinInfo(){
        return "user/join/join_info";
    }

    @GetMapping("/join-ok")
    public String joinOk(){
        return "user/join/join_ok";
    }

    @GetMapping("/login")
    public String login(){
        return "user/login/login";
    }

    @GetMapping("/find-id")
    public String findId(){
        return "user/find_id/find_id";
    }

    @GetMapping("/find-pwd")
    public String findPwd(){
        return "user/find_pw/find_pwd";
    }

    @GetMapping("/find-pwd/certify-list")
    public String certifyPwd(){
        return "user/find_pw/certify_list";
    }

    @GetMapping("/find-pwd/certify-sms")
    public String certifySms(){
        return "user/find_pw/certify_sms";
    }

    @GetMapping("/find-pwd/certify-email")
    public String certifyEmail(){
        return "user/find_pw/certify_email";
    }

    @GetMapping("/reset-pwd")
    public String resetPwd(){
        return "user/find_pw/reset_pwd";
    }

    @GetMapping("/password-ok")
    public String passwordOk(){
        return "user/find_pw/complete_pwd";
    }

// 회원가입 처리
    @PostMapping("/joinInfo")
    public RedirectView join(UserDto userDto){
        userService.register(userDto);
        return new RedirectView("/user/login/login");
    }

// 로그인 처리
    @PostMapping("/login")
    public RedirectView login(String userId, String userPassword, HttpServletRequest req){
        Long userNumber = userService.findUserNumber(userId, userPassword);
        HttpSession session = req.getSession();
        session.setAttribute("userNumber", userNumber);
        return new RedirectView("/admin");  //메인화면경로 설정하기
    }

// 로그아웃 처리
    @GetMapping("/logout")
    public RedirectView logout(HttpServletRequest req){
        req.getSession().invalidate();
        return new RedirectView("/admin"); //메인화면경로 설정하기
    }

    }

