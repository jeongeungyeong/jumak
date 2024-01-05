package com.example.jumak.mapper.mypage;

import com.example.jumak.domain.vo.myPage.OrderDetailVo;
import com.example.jumak.service.mypage.ShippingService;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class SearchShippingMapperTest {
    @Autowired
    ShippingService shippingService;

    OrderDetailVo orderDetailVo;

    @BeforeEach
    void setup() {
        orderDetailVo = new OrderDetailVo();
        orderDetailVo.setStartDate("2021-12-01");
        orderDetailVo.setEndDate("2023-12-21");
        orderDetailVo.setUserNumber(1L);
    }

    @Test
    void selectOrderDetail() {
        shippingService.findSearchDetail(orderDetailVo);
    }
}