package com.example.jumak.mapper.product;

import com.example.jumak.domain.dto.product.ProductDto;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;
import java.util.Optional;

@Mapper
public interface ProductMapper {
//    상품 번호 조회
    Optional<ProductDto> selectByNumber(Long productNumber);
//    상품 카테고리로 조회
    List<ProductDto> selectByCategory(Long productCategoryNumber);
//    전체 상품 조회
    List<ProductDto> selectAll();
    //    상품 총 개수
    public int selectTotal();
//    판매량 베스트 상품
    List<ProductDto> selectSaleBest();
//    정렬 분류: 등록일순
    List<ProductDto> arrUpdate();
//    정렬 분류: 판매인기순
List<ProductDto> arrSale();
//    정렬 분류: 낮은 가격순
List<ProductDto> arrLPrice();
//    정렬 분류: 높은 가격순
List<ProductDto> arrHPrice();
}
