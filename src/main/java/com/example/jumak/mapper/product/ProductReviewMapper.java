package com.example.jumak.mapper.product;

import com.example.jumak.domain.dto.product.ProductReviewDto;
import com.example.jumak.domain.vo.product.Criteria;
import com.example.jumak.domain.vo.product.ProductReviewVo;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;

@Mapper
public interface ProductReviewMapper {
//    상품 후기 리스트 조회
    List<ProductReviewVo> selectListByProductNumber(Long productNumber);
//    상품 후기 작성
    void insert(ProductReviewDto productReviewDto);


}
