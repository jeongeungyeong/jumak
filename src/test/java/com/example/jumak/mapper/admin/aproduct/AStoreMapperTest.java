package com.example.jumak.mapper.admin.aproduct;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.*;


@SpringBootTest
class AStoreMapperTest {
    @Autowired
    AProductMapper aProductMapper;

    @BeforeEach
    void setUp() {
    }

    @Test
    void selectOne() {
        aProductMapper.selectOne(64L);
    }
}