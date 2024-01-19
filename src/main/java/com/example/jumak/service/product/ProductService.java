package com.example.jumak.service.product;

import com.example.jumak.domain.vo.product.Criteria;
import com.example.jumak.domain.vo.product.ProductInfoVo;
import com.example.jumak.mapper.product.ProductMapper;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import java.util.Optional;

@Service
@RequiredArgsConstructor
@Transactional
public class ProductService {
    private final ProductMapper productMapper;

//    우리술 메인
    public List<ProductInfoVo> findGroupOne(){
        return productMapper.selectGroupOne();
    }

/*    public List<ProductInfoVo> findGroupCate(Long productCategoryNumber){
        return Optional.ofNullable(productMapper.selectGroupCate(productCategoryNumber))
                .orElseThrow(()->new IllegalStateException("카테고리 상품 조회결과 없음!"));
    }*/
    //    우리술 상품리스트
    public List<ProductInfoVo> findByCond(String orderCond, String cate, Criteria criteria){
        return productMapper.selectByOrderCond(orderCond,cate,criteria);
    }

    //    우리술 상품카운트
    public Long findTotalByCond(String cate){
        return productMapper.selectTotalByCond(cate);
    }
}
