package com.example.jumak.service.product;

import com.example.jumak.domain.vo.product.Criteria;
import com.example.jumak.domain.vo.product.ProductDetailVo;
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
    public List<ProductInfoVo> findGroupOne(Long categoryNumber){
        return productMapper.selectGroupOne(categoryNumber);
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

//    우리술 상품 번호 상세 조회
public ProductInfoVo findByDNumber(Long productNumber){
    return productMapper.selectByDNumber(productNumber)
            .orElseThrow( ()-> new IllegalStateException("상품 조회 결과 없음!"));
}

    //    우리술 상품 디테일 이미지 조회
    public List<ProductInfoVo> findByDImg(Long productNumber){
        return Optional.ofNullable(productMapper.selectByDImg(productNumber))
                .orElseThrow( ()-> new IllegalStateException("상품 이미지 조회 결과 없음!"));
    }

}
