package com.example.jumak.controller.mypage;

import com.example.jumak.domain.vo.myPage.OrderDetailVo;
import com.example.jumak.service.mypage.ShippingService;
import jakarta.servlet.http.HttpServletRequest;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequiredArgsConstructor
@RequestMapping("/mypages")
public class MypageMainRestController {

    private final ShippingService shippingService;



//    주문내역 배송상태 조회
    @GetMapping("/search-shipping")
    public List<OrderDetailVo> searchShipping(
            @RequestParam String startDate,
            @RequestParam String endDate,
            HttpServletRequest req) {
//        Long userNumber = (Long) req.getSession().getAttribute("userNumber");
        Long userNumber = 1L;
        OrderDetailVo orderDetailVo = new OrderDetailVo();
        orderDetailVo.setStartDate(startDate);
        orderDetailVo.setEndDate(endDate);
        orderDetailVo.setUserNumber(userNumber);

        return shippingService.findSearchShipping(orderDetailVo);
    }

//    취소/반품/교환상태 조회
    @GetMapping("/cancel-shipping")
    public List<OrderDetailVo> cancelShipping(
            @RequestParam String startDate,
            @RequestParam String endDate,
            HttpServletRequest req) {
//        Long userNumber = (Long) req.getSession().getAttribute("userNumber");
        Long userNumber = 1L;
        OrderDetailVo orderDetailVo = new OrderDetailVo();
        orderDetailVo.setStartDate(startDate);
        orderDetailVo.setEndDate(endDate);
        orderDetailVo.setUserNumber(userNumber);

        return shippingService.findCancelDetail(orderDetailVo);
    }
}
