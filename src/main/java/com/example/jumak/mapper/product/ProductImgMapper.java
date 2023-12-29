package com.example.jumak.mapper.product;

import com.example.jumak.domain.dto.product.ProductImgDto;
import com.example.jumak.domain.dto.product.ProductImgMainDto;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;


@Mapper
public interface ProductImgMapper {
    //    상품 메인 이미지 조회
    List<ProductImgMainDto> selectMList(Long productNumber);

    //    상품 디테일 이미지
    List<ProductImgDto> selectDList(Long productNumber);

}
