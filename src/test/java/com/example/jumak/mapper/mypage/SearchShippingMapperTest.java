package com.example.jumak.mapper.mypage;

import com.example.jumak.domain.vo.myPage.OrderDetailVo;
import com.example.jumak.service.mypage.SearchShippingService;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest
class SearchShippingMapperTest {
    @Autowired
    SearchShippingService searchShippingService;

    OrderDetailVo orderDetailVo;

    @BeforeEach
    void setup() {
        orderDetailVo = new OrderDetailVo();
        orderDetailVo.setOrderDate("2021-12-21");
        orderDetailVo.setUserNumber(1L);
    }

    @Test
    void selectOrderDetail() {
        searchShippingService.findOrderDetail(orderDetailVo);
    }
}