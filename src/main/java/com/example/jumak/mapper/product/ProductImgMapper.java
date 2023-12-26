package com.example.jumak.mapper.product;

import com.example.jumak.domain.dto.product.ProductImgMainDto;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;


@Mapper
public interface ProductImgMapper {
//    상품 메인 이미지 등록
    void insert(ProductImgMainDto productImgMainDto);

//    상품 메인 이미지 조회
    List<ProductImgMainDto> selectList(Long productNumber);

//    상품 디테일 이미지

}
