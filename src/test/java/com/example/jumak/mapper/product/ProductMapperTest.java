package com.example.jumak.mapper.product;

import com.example.jumak.domain.vo.product.ProductListVo;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;

@SpringBootTest
class ProductMapperTest {
    @Autowired
    ProductMapper productMapper;

    @Test
    void selectByNumber() {
        productMapper.selectByNumber(25L);
    }
    @Test
    void selectByCategory(){
        productMapper.selectByCategory(1L);
    }

    @Test
    void selectAll() {
        productMapper.selectAll();
    }

    @Test
    void selectTotal() {
        productMapper.selectTotal();
    }


    @Test
    void selectSaleBest() {
        productMapper.selectSaleBest();
    }

    @Test
    void arrUpdate() {
        productMapper.arrUpdate();
    }

    @Test
    void arrSale() {
        List<ProductListVo> productListVos = productMapper.arrSale();
        System.out.println("productListVos = " + productListVos);
    }

    @Test
    void arrLPrice() {
        productMapper.arrLPrice();
    }

    @Test
    void arrHPrice() {
        productMapper.arrHPrice();
    }
}