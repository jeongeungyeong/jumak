package com.example.jumak.mapper.product;

import com.example.jumak.domain.dto.product.ProductReviewDto;
import com.example.jumak.domain.vo.product.Criteria;
import com.example.jumak.domain.vo.product.ProductReviewVo;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;

@Mapper
public interface ProductReviewMapper {
//    상품 후기 작성
    void reviewInsert(ProductReviewVo productReviewVo);
//    상품 후기 조회
    List<ProductReviewVo> reviewList(Long productNumber);
//    상품 후기 전체 조회
int selectTotal(Long productNumber);
//상품 후기 수정
void reviewUpdate(ProductReviewDto productReviewDto);
//상품 후기 삭제
void reviewDelete(Long productReviewNumber);
//상품 후기 페이징 처리
    List<ProductReviewVo> selectListPage(@Param("criteria") Criteria criteria,
                                         @Param("productNumber") Long productNumber);

}
