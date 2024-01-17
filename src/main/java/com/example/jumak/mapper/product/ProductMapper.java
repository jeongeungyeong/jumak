package com.example.jumak.mapper.product;

import com.example.jumak.domain.vo.product.Criteria;
import com.example.jumak.domain.vo.product.ProductInfoVo;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;

@Mapper
public interface ProductMapper {
    // 우리술 전체보기
    List<ProductInfoVo> selectByOrderCond(@Param("orderCond") String orderCond,
                                          @Param("cate") String cate,
                                          @Param("criteria") Criteria criteria);

    Long selectTotalByCond(String cate);

}
