package com.example.jumak.mapper.product;

import com.example.jumak.domain.dto.product.ProductImgDto;
import com.example.jumak.domain.dto.product.ProductImgMainDto;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest
class ProductImgMapperTest {
    @Autowired
    ProductImgMapper productImgMapper;

    ProductImgMainDto productImgMainDto;
    ProductImgDto productImgDto;

    @BeforeEach
    void setUp() {

    }

/*    @Test
    void selectMList() {
        productImgMapper.selectMList();
    }*/

    @Test
    void selectDList() {
    }
}