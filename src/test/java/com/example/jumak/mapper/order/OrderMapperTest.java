package com.example.jumak.mapper.order;

import com.example.jumak.domain.vo.order.OrderFinishVo;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.*;
@SpringBootTest
class OrderMapperTest {
    @Autowired
    OrderMapper orderMapper;

    OrderFinishVo orderFinishVo;

    @BeforeEach
    void setUp(){
        orderFinishVo = new OrderFinishVo();
    }

     @Test
    void selectByNumber() {
      orderMapper.selectByNumber();

    }
}