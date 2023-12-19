package com.example.jumak.mapper.product;

import com.example.jumak.domain.dto.product.ProductDto;
import com.example.jumak.domain.vo.product.ProductVo;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface ProductMapper {
//    상품 등록
    void insert(ProductDto productDto);
//    전체 상품수 조회
    public int selectTotal();
//    상품 상세 정보 조회
    public List<ProductVo> select();
//    상품 리스트 조회
}
