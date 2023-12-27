package com.example.jumak.mapper.product;

import com.example.jumak.domain.dto.product.ProductDto;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface ProductMapper {
//    상품 번호 조회
    ProductDto selectByNumber(Long productNumber);
//    상품 카테고리로 조회
    ProductDto selectByCategory(Long productCategoryNumber);
//    전체 상품 조회
    List<ProductDto> selectAll();
//    상품 총 개수
    public int selectTotal();
}
