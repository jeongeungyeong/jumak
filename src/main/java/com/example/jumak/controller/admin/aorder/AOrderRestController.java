package com.example.jumak.controller.admin.aorder;

import com.example.jumak.service.admin.aorder.AOrderService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.PatchMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;


@RestController
@RequiredArgsConstructor
@RequestMapping("/admin/order")
public class AOrderRestController {
    private final AOrderService aOrderService;

//    회원등급수정
    @PatchMapping("/update")
    public void modifyOrderStatus(@RequestParam("orderNumber") Long orderNumber, @RequestParam("orderStatusNumber") Long orderStatusNumber){
//        System.out.println("orderNumber = " + orderNumber + ", orderStatusNumber = " + orderStatusNumber);
        aOrderService.modifyOrderStatus(orderNumber,orderStatusNumber);
    }
}










