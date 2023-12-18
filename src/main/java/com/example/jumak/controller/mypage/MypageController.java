package com.example.jumak.controller.mypage;

import com.example.jumak.domain.dto.madang.MadangDto;
import com.example.jumak.domain.dto.user.UserDto;
import com.example.jumak.service.mypage.MypageService;
import lombok.RequiredArgsConstructor;
import org.apache.catalina.User;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequiredArgsConstructor
@RequestMapping("/mypage")
public class MypageController {
    private final MypageService mypageService;


//    메인
    @GetMapping("/main")
    public String main(UserDto userDto, MadangDto madangDto, Model model) {
        String userName = "유지수";

 //       String userName = userDto.getUserName();
        Long countMadang = madangDto.getUserNumber();

        model.addAttribute("user", userName);
        model.addAttribute("madang", countMadang);

        return "mypage/main/main";
    }

//    주문목록/배송조히
    @GetMapping("/search-shipping")
    public String searchShipping() {
        return "mypage/search_shipping/search_shipping";
    }


//    주문 취소 페이지
    @GetMapping("/cancel-shipping")
    public String cancelShipping() {
        return "mypage/cancel_shipping/cancel_shipping";
    }

//    환불
    @GetMapping("/refund-shipping")
    public String refundShipping() {
        return "mypage/refund_shipping/refund_shipping";
    }

//    1대1 문의
    @GetMapping("/inquiry")
    public String inquiry () {
        return "mypage/inquiry/inquiry";
    }

//    회원정보
    @GetMapping("/member-info")
    public String memberInfo() {
        return "mypage/member_info/member_info";
    }

//    회원탈퇴
    @GetMapping("/member-delete")
    public String memberDelete() {
        return "mypage/member_delete/member_delete";
    }

//    배송지 관리
    @GetMapping("/shopping-address")
    public String shoppingAddress() {
        return "mypage/shopping_address/shopping_address";
    }

//    작성글확인
    @GetMapping("/manage-comment")
    public String manageComment() {
        return "mypage/manage_comment/manage_comment";
    }

}
