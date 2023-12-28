package com.example.jumak.mapper.admin.aorder;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest
class AOrderMapperTest {
    @Autowired
    AOrderMapper aOrderMapper;

    @BeforeEach
    void setUp() {
    }

//    @Test
//    void selectAll() {
//        aOrderMapper.selectAll();
//    }

    @Test
    void updateOrderStatus(){
        aOrderMapper.updateOrderStatus(2l,3l);
    }
}