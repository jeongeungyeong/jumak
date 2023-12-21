package com.example.jumak.mapper.product;

import com.example.jumak.domain.dto.product.ProductDto;
import com.example.jumak.domain.vo.product.Criteria;
import com.example.jumak.domain.vo.product.ProductVo;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;
import java.util.Optional;

@Mapper
public interface ProductMapper {
//    상품 상세 정보 조회
//    public Optional<ProductVo> select(Long productNumber);
//    카테고리 리스트
//    상품 리스트
    public List<ProductVo> productsGetList();
//    상품 총 개수
    public int selectTotal();
//    상품 조회 페이지
}
