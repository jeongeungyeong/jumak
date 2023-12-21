package com.example.jumak.mapper.product;

import com.example.jumak.domain.dto.product.ProductDto;
import com.example.jumak.domain.vo.product.Criteria;
import com.example.jumak.domain.vo.product.ProductVo;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;
import java.util.Optional;

@Mapper
public interface ProductMapper {
    //    전체 상품 리스트 조회
    public List<ProductVo> selectAll(Criteria criteria);
    //    카테고리 조회
//    상품 상세 정보 조회
    public Optional<ProductVo> select(Long productNumber);
//    총 상품수 조회
    public int selectTotal();
}
