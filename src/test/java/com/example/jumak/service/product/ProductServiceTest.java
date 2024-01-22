package com.example.jumak.service.product;

import com.example.jumak.domain.vo.product.ProductInfoVo;
import com.example.jumak.mapper.product.ProductMapper;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.jupiter.MockitoExtension;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;
@ExtendWith(MockitoExtension.class)
class ProductServiceTest {
    @Mock
    ProductMapper productMapper;
    @InjectMocks
    ProductService productService;

    ProductInfoVo productInfoVo;

    @BeforeEach
    void setUp() {
        productInfoVo = new ProductInfoVo();

    }

    @Test
    void findGroupOne() {
        //given
        //when

        //then
    }
}