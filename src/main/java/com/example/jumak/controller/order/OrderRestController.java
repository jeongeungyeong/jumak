package com.example.jumak.controller.order;

import com.example.jumak.domain.vo.order.OrderVo;
import com.example.jumak.service.order.OrderService;
import jakarta.servlet.http.HttpSession;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.SessionAttribute;

@RestController
@RequiredArgsConstructor
@RequestMapping("/orders")
public class OrderRestController {
    private final OrderService orderService;

    @GetMapping("/delivery")
    public OrderVo orderDelivery(@SessionAttribute("userNumber") Long userNumber){
       return orderService.findByUNumber(userNumber);

    }
}
