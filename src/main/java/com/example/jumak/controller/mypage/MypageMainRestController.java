package com.example.jumak.controller.mypage;

import com.example.jumak.domain.vo.myPage.OrderDetailVo;
import com.example.jumak.service.mypage.SearchShippingService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequiredArgsConstructor
@RequestMapping("/mypage")
public class MypageMainRestController {

    private final SearchShippingService searchShippingService;

    //    url로 데이터를 넘겨받아 조회가 가능하다.
//    경로상의 데이터를 받기 위해서는 @PathVariable 을 사용한다.
    @GetMapping("/search-shipping/{orderDate}")
    public void periodInquiry(@RequestBody OrderDetailVo orderDetailVo) {
        List<OrderDetailVo> orderDetailList = searchShippingService.findOrderDetail(orderDetailVo);
    }

}
