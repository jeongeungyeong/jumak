package com.example.jumak.mapper.admin.aproduct;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest
class AProductImgMainMapperTest {
    @Autowired
    AProductImgMainMapper aProductImgMainMapper;

    @BeforeEach
    void setUp() {
    }

    @Test
    void selectOne() {
        aProductImgMainMapper.selectOne(102L);
    }
}