package com.example.jumak.mapper.product;

import com.example.jumak.domain.dto.product.ProductDto;
import com.example.jumak.domain.vo.product.Criteria;
import com.example.jumak.domain.vo.product.ProductDetailVo;
import com.example.jumak.domain.vo.product.ProductListVo;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;
import java.util.Optional;

@Mapper
public interface ProductMapper {


    List<ProductListVo> selectByOrderCond(@Param("orderCond") String orderCond,
                                          @Param("cate") String cate,
                                          @Param("criteria")Criteria criteria);

    Long selectTotalByCond(String cate);

//     상품 디테일 페이지
//    List<ProductDetailVo> selectByDetail();

//    상품 디테일 번호로 조회
    Optional<ProductDetailVo> selectByDNumber(Long productNumber);

//    상품 디테일 이미지 조회
    List<ProductDetailVo> selectByDImg(Long productNumber);

}
