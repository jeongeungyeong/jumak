package com.example.jumak.mapper.product;

import com.example.jumak.domain.dto.product.ProductCategoryDto;
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

    ProductDto productDto;
    ProductCategoryDto productCategoryDto;

    @BeforeEach
    void setUp() {
        productDto = new ProductDto();

        productDto.setProductCategoryNumber(1L);
        productDto.setProductName("test");
        productDto.setProductSubtitle("test");
        productDto.setProductRawMaterial("막걸리");
        productDto.setProductNetWeight(1L);
        productDto.setProductAlcoholicity(5L);
        productDto.setProductArea("대한민국");
        productDto.setProductDescription("우리술");
        productDto.setProductPrice(5000L);
        productDto.setProductInventory(5L);
        productDto.setProductSales(100L);
        productDto.setProductDiscount(5L);
        productDto.setProductReleaseDate("2023-12-22");
        productDto.setProductDistillery("한국");
        productMapper.insertProduct(productDto);
    }

    @Test
    void selectByNumber() {
        productMapper.insertProduct(productDto);
        productMapper.selectByNumber(productDto.getProductNumber());
    }
}