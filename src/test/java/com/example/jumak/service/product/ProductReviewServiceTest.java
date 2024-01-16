package com.example.jumak.service.product;

import com.example.jumak.domain.dto.product.ProductReviewDto;
import com.example.jumak.domain.vo.product.ProductReviewVo;
import com.example.jumak.mapper.product.ProductReviewMapper;
import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.jupiter.MockitoExtension;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.*;

@ExtendWith(MockitoExtension.class)
class ProductReviewServiceTest {
    @Mock
    ProductReviewMapper productReviewMapper;

    @InjectMocks
    ProductReviewService productReviewService;

    ProductReviewDto productReviewDto;
    ProductReviewVo productReviewVo;

    @BeforeEach
    void setUp() {
        productReviewDto = new ProductReviewDto();
        productReviewVo = new ProductReviewVo();
    }

/*    @Test
    void reviewRegister() {
        // given
        doNothing().when(productReviewMapper).reviewInsert(any(ProductReviewVo.class));
        // when
        productReviewService.reviewRegister(productReviewVo);
        // then
        verify(productReviewMapper,times(1)).reviewInsert(any());
    }*/

/*    @Test
    void findReviewList() {
        // given
            Mockito.doReturn(List.of(productReviewVo)).when(productReviewMapper).reviewList();
        // when

        // then
    }*/
}