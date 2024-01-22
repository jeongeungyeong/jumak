package com.example.jumak.mapper.product;

import com.example.jumak.domain.dto.product.ProductReviewDto;
import com.example.jumak.domain.dto.user.UserDto;
import com.example.jumak.domain.vo.product.ProductReviewVo;
import com.example.jumak.mapper.user.UserMapper;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.*;
@SpringBootTest
@Transactional
class ProductReviewMapperTest {
    @Autowired ProductReviewMapper productReviewMapper;
    @Autowired UserMapper userMapper;

    ProductReviewDto productReviewDto;
    UserDto userDto;
    ProductReviewVo productReviewVo;

    @BeforeEach
    void setUp() {
        userDto = new UserDto();
        productReviewDto = new ProductReviewDto();
    }


}