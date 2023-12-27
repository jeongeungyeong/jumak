package com.example.jumak.controller.admin.aorder;

import com.example.jumak.domain.dto.order.OrderDto;
import com.example.jumak.domain.vo.admin.ACriteria;
import com.example.jumak.domain.vo.admin.APageVo;
import com.example.jumak.service.admin.aorder.AOrderService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@Controller
@RequiredArgsConstructor
@RequestMapping("/admin/order")
public class AOrderController {
    private final AOrderService aOrderService;

    @GetMapping
    public String orderList(ACriteria aCriteria, Model model){
        List<OrderDto> orderList = aOrderService.findAll(aCriteria);
        model.addAttribute("orderList", orderList);
        model.addAttribute("pageInfo", new APageVo(aOrderService.findTotal(),aCriteria));
        return "admin/order/orderList";
    }
}
