package com.example.jumak.controller.mypage;

import com.example.jumak.domain.dto.madang.MadangDto;
import com.example.jumak.domain.dto.order.PaymentDto;
import com.example.jumak.domain.dto.user.UserDto;
import com.example.jumak.domain.vo.myPage.OrderDetailVo;
import com.example.jumak.domain.vo.myPage.OrderStatusVo;
import com.example.jumak.service.mypage.MypageService;
import jakarta.servlet.http.HttpServletRequest;
import lombok.RequiredArgsConstructor;
import org.apache.catalina.User;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@Controller
@RequiredArgsConstructor
@RequestMapping("/mypage")
public class MypageController {
    private final MypageService mypageService;


//    메인
    @GetMapping("/main")
    public String main(Model model, HttpServletRequest req) {
//        Long userNumber = (Long)req.getSession().getAttribute("userNumber");
        Long userNumber = 1L;

//        회원 이름 조회
        String userName = mypageService.findUserName(userNumber);
//        작성글 개수 조회
        Long boardCount = mypageService.findBoardCount(userNumber);
//        댓글수 조회
        Long replyCount = mypageService.findReplyCount(userNumber);
//        배송 상태 조회
        List<OrderStatusVo> statusList = mypageService.findOrderStatusCount(userNumber);
//        배송 취소/반품/교환/환불 조회
        List<OrderStatusVo> cancelList = mypageService.findOrderCancelStatusCount(userNumber);
//        배송 상세 날짜/주문번호 조회
        List<OrderDetailVo> orderDetailList = mypageService.findOrderDetail(userNumber);


        model.addAttribute("userName", userName);
        model.addAttribute("boardCount", boardCount);
        model.addAttribute("replyCount", replyCount);
        model.addAttribute("statusList", statusList);
        model.addAttribute("cancelList", cancelList);
        model.addAttribute("orderDetailList", orderDetailList);

        return "mypage/main/main";
    }

//    주문목록/배송조히
    @GetMapping("/search-shipping")
    public String searchShipping(Model model, HttpServletRequest req) {
//        Long userNumber = (Long)req.getSession().getAttribute("userNumber");
        Long userNumber = 1L;


//        회원 이름 조회
        String userName = mypageService.findUserName(userNumber);
//        작성글 개수 조회
        Long boardCount = mypageService.findBoardCount(userNumber);
//        댓글수 조회
        Long replyCount = mypageService.findReplyCount(userNumber);




        model.addAttribute("userName", userName);
        model.addAttribute("boardCount", boardCount);
        model.addAttribute("replyCount", replyCount);

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
