package com.example.jumak.mapper.product;

import com.example.jumak.domain.vo.product.ProductDetailVo;
import com.example.jumak.domain.vo.product.ProductListVo;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;

@SpringBootTest
class ProductMapperTest {
    @Autowired
    ProductMapper productMapper;


/*    @Test
    void selectByDetail() {
        productMapper.selectByDetail();
    }*/

    @Test
    void selectByDNumber() {
        productMapper.selectByDNumber(26L);
    }

    @Test
    void selectByDImg() {
        List<ProductDetailVo> productDImgList = productMapper.selectByDImg(26L);
    }
}