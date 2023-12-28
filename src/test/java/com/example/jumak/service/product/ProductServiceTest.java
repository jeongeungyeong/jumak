package com.example.jumak.service.product;

import com.example.jumak.domain.dto.product.ProductDto;
import com.example.jumak.mapper.product.ProductMapper;
import org.assertj.core.api.Assertions;
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


@ExtendWith(MockitoExtension.class)
class ProductServiceTest {
    @Mock
    ProductMapper productMapper;
    @InjectMocks
    ProductService productService;

    ProductDto productDto;

    @BeforeEach
    void setUp(){
        productDto = new ProductDto();
    }

    @Test
    void findByNumber() {
        // given
        doReturn(Optional.ofNullable(productDto)).when(productMapper).selectByNumber(any());
        // when
        ProductDto foundProduct = productService.findByNumber(30L);
        // then
        assertThat(foundProduct).isEqualTo(productDto);
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
        // given
            doReturn(List.of(productDto)).when(productMapper).selectAll();
        // when
        List<ProductDto> productList = productService.findAll();
        // then
        assertThat(productList).contains(productDto);
    }

}