package com.example.jumak.controller.order;

import com.example.jumak.domain.dto.order.OrderDto;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequiredArgsConstructor
@RequestMapping("order")
public class OrderController {
    private final OrderDto orderDto;


    @GetMapping("/next")
    public String orderMain(){
        return "order/storeorder";
    }

    @GetMapping("/fail")
    public String orderFail(){
        return "order/storeorderfail";
    }

    @GetMapping("/success")
    public String orderSuccess(){ return "order/storeordersucc";}

}
