package com.example.jumak.mapper.product;

import com.example.jumak.domain.vo.product.Criteria;
import com.example.jumak.domain.vo.product.ProductDetailVo;
import com.example.jumak.domain.vo.product.ProductInfoVo;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;
import java.util.Optional;

@Mapper
public interface ProductMapper {
//    우리술 메인 페이지
    List<ProductInfoVo> selectGroupOne(@Param("categoryNumber") Long categoryNumber);



    // 우리술 전체보기
    List<ProductInfoVo> selectByOrderCond(@Param("orderCond") String orderCond,
                                          @Param("cate") String cate,
                                          @Param("criteria") Criteria criteria);

    Long selectTotalByCond(String cate);

//    우리술 디테일페이지 번호로 조회
  Optional<ProductInfoVo> selectByDNumber(Long productNumber);

    //    상품 디테일 이미지 조회
    List<ProductInfoVo> selectByDImg(Long productNumber);
}
