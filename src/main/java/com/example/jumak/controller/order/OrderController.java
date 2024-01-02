package com.example.jumak.controller.order;

import com.example.jumak.domain.dto.order.OrderDto;
import com.example.jumak.domain.vo.order.OrderFinishVo;
import com.example.jumak.service.order.OrderService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@Controller
@RequiredArgsConstructor
@RequestMapping("order")
public class OrderController {
    private final OrderDto orderDto;
    private final OrderService orderService;


    @GetMapping("/next")
    public String orderMain(){
        return "order/storeorder";
    }

    @GetMapping("/fail")
    public String orderFail(Model model){
        List<OrderFinishVo> orderFinList = orderService.findByNumber();
        model.addAttribute("finalorders",orderFinList);
        return "order/storeorderfail";
    }

    //    임시 이동경로
    @GetMapping("/cart")
    public String cartPage(){
        return "order/cart";
    }

    @GetMapping("/success")
    public String orderSuccess(Model model){
        List<OrderFinishVo> orderFinList = orderService.findByNumber();
        model.addAttribute("finalorders",orderFinList);
        return "order/storeordersucc";
    }
}
