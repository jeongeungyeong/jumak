package com.example.jumak.controller.admin.aorder;

import com.example.jumak.domain.dto.order.OrderDto;
import com.example.jumak.domain.vo.admin.*;
import com.example.jumak.service.admin.aorder.AOrderService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@Controller
@RequiredArgsConstructor
@RequestMapping("/admin/order")
public class AOrderController {
    private final AOrderService aOrderService;

    @GetMapping
    public String orderList(ACriteria aCriteria, Model model){
        List<AOrderVo> orderList = aOrderService.findAll(aCriteria);
        model.addAttribute("orderList", orderList);
        model.addAttribute("pageInfo", new APageVo(aOrderService.findTotal(),aCriteria));
        return "admin/order/orderList";
    }

    @GetMapping("/detail/{orderNumber}")
    public String orderDetail(@PathVariable("orderNumber") Long orderNumber,
                              Model model){
        AOrderVo order = aOrderService.selectOrderOne(orderNumber);
        List<AOrderDetailVo> orderDetailList = aOrderService.selectOrderDetail(orderNumber);

        model.addAttribute("order",order);
        model.addAttribute("orderDetail",orderDetailList);
        return "admin/order/orderDetail";
    }

    @GetMapping("/search")
    public String searchResult(ASearchVo aSearchVo,ACriteria aCriteria, Model model){
        List<AOrderVo> searchOrder = aOrderService.selectSearch(aSearchVo, aCriteria);

        model.addAttribute("orderList",searchOrder);
        model.addAttribute("searchVo", aSearchVo);
        model.addAttribute("pageInfo", new APageVo(aOrderService.selectSearchTotal(aSearchVo),aCriteria));
        return "admin/order/orderListSearch";

    }
}
