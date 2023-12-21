package com.example.jumak.mapper.product;

import com.example.jumak.domain.dto.product.ProductDto;
import com.example.jumak.domain.dto.product.ProductImgDto;
import com.example.jumak.domain.dto.product.ProductImgMainDto;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest
class ProductMapperTest {
    @Autowired ProductMapper productMapper;
    @Autowired ProductImgMapper productImgMapper;

    ProductDto productDto;
    ProductImgMainDto productImgMainDto;


    @BeforeEach
    void setUp() {
        productDto = new ProductDto();
        productDto.setProductCategoryNumber(1L);
        productDto.setProductName("test");
        productDto.setProductNetWeight(1L);
        productDto.setProductAlcoholicity(5L);
        productDto.setProductPrice(5000L);
        productDto.setProductDiscount(5L);

        productImgMainDto.setProductImgMainName("test1");
        productImgMainDto.setProductImgMainUuid("test");
        productImgMainDto.setProductImgMainPath("test");
    }

    @Test
    void productsGetList() {
        //given

        //when

        //then
    }

}