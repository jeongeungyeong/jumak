package com.example.jumak.controller.user;

import com.example.jumak.service.user.UserService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequiredArgsConstructor
@RequestMapping("/user")
public class UserController {
 private final UserService userService;

    @GetMapping("/join/agree")
    public String joinAgree(){
        return "user/join/join";
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



}
