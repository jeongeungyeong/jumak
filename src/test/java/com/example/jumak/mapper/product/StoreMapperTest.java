package com.example.jumak.mapper.product;

import com.example.jumak.domain.vo.product.ProductDetailVo;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;

@SpringBootTest
class StoreMapperTest {
    @Autowired
    StoreMapper storeMapper;


/*    @Test
    void selectByDetail() {
        productMapper.selectByDetail();
    }*/

    @Test
    void selectByDNumber() {
        storeMapper.selectByDNumber(26L);
    }

    @Test
    void selectByDImg() {
        List<ProductDetailVo> productDImgList = storeMapper.selectByDImg(26L);
    }
}