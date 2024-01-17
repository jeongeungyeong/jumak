package com.example.jumak.service.product;

import com.example.jumak.domain.dto.product.ProductDto;
import com.example.jumak.domain.vo.product.ProductDetailVo;
import com.example.jumak.mapper.product.StoreMapper;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.jupiter.MockitoExtension;

import java.util.List;
import java.util.Optional;

import static org.assertj.core.api.Assertions.assertThat;
import static org.mockito.ArgumentMatchers.any;
import static org.mockito.Mockito.doReturn;
import static org.mockito.Mockito.mock;


@ExtendWith(MockitoExtension.class)
class StoreServiceTest {
    @Mock
    StoreMapper storeMapper;
    @InjectMocks
    StoreService storeService;

    ProductDto productDto;
    ProductDetailVo productDetailVo;

    @BeforeEach
    void setUp(){
        productDto = new ProductDto();
        productDetailVo = new ProductDetailVo();
    }



/*    @Test
    void findByCategory() {
        // given
            doReturn(List.of(productDto)).when(productMapper).selectByCategory(any());
        // when
        List<ProductDto> foundCategory = productService.findByCategory(1L);
        // then
        assertThat(foundCategory).isEqualTo(productDto);
    }*/

    @Test
    void findAll() {
//        // given
//            doReturn(List.of(productDto)).when(productMapper).selectAll();
//        // when
//        List<ProductListVo> productList = productService.findAll();
//        // then
//        assertThat(productList).contains(productDto);
    }

    @Test
    void findByDNumber() {
        //given
        doReturn(Optional.ofNullable(productDetailVo)).when(storeMapper).selectByDNumber(any());
        //when
        ProductDetailVo foundDNumber = storeService.findByDNumber(26L);
        //then
        assertThat(foundDNumber).isEqualTo(productDetailVo);
    }

    @Test
    void findByDImg() {
        // given
        Mockito.doReturn(List.of(productDetailVo)).when(storeMapper).selectByDImg(26L);
        // when
        List<ProductDetailVo> byDImgList = storeService.findByDImg(26L);
        // then
        assertThat(byDImgList).contains(productDetailVo);
    }

/*    @Test
    void findByDetail() {
        // given
            doReturn(List.of(productDetailVo)).when(productMapper).selectByDetail();
        // when
        List<ProductDetailVo> productDetailList = productService.findByDetail();
        // then
        Assertions.assertThat(productDetailList).contains(productDetailVo);
    }*/
}
