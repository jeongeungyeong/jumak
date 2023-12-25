package com.example.jumak.mapper.product;

import com.example.jumak.domain.dto.product.ProductCategoryDto;
import com.example.jumak.domain.dto.product.ProductDto;
import com.example.jumak.domain.vo.product.ProductVo;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface ProductMapper {
//    상품 조회
    ProductDto selectByNumber(Long productNumber);
//    전체 상품 조회
    List<ProductDto> selectAll();
//    상품 등록
    void insertProduct(ProductDto productDto);
//    상품 카테고리 등록
//    void insertCategory(ProductCategoryDto productCategoryDto);
//    상품 총 개수
    public int selectTotal();
}
