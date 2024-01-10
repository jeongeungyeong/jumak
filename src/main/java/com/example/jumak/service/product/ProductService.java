package com.example.jumak.service.product;

import com.example.jumak.domain.dto.product.ProductDto;
import com.example.jumak.domain.vo.product.Criteria;
import com.example.jumak.domain.vo.product.ProductDetailVo;
import com.example.jumak.domain.vo.product.ProductListVo;
import com.example.jumak.domain.vo.product.ProductVo;
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

//    상품 조회(정렬기준 받기)
    public List<ProductListVo> findByCond(String orderCond, String cate, Criteria criteria){
        return productMapper.selectByOrderCond(orderCond, cate, criteria);
    }

//    상품 카운트 조회
    public Long findTotalByCond(String cate){
        return productMapper.selectTotalByCond(cate);
    }

//    상품 번호 조회
    public ProductDto findByNumber(Long productNumber){
        return productMapper.selectByNumber(productNumber)
                .orElseThrow( () -> new IllegalStateException( "상품 조회 결과 없음!"));
    }

//    상품 카테고리로 조회
/*    List<ProductDto> findByCategory(Long productCategoryNumber){
        return Optional.ofNullable(productMapper.selectByCategory(productCategoryNumber))
                .orElseThrow( () -> new IllegalStateException("카테고리 조회 결과 없음!"));
    }*/

//    전체 상품 조회
   public List<ProductListVo> findAll(){return productMapper.arrSale();}

//    상품 상세정보 조회
/*  public List<ProductDetailVo> findByDetail(){
       return productMapper.selectByDetail();
  };*/

//    상품 번호 상세 조회
    public ProductDetailVo findByDNumber(Long productNumber){
        return productMapper.selectByDNumber(productNumber)
                .orElseThrow( ()-> new IllegalStateException("상품 조회 결과 없음!"));
    }

//    상품 디테일 이미지 조회
    public List<ProductDetailVo> findByDImg(Long productNumber){
        return Optional.ofNullable(productMapper.selectByDImg(productNumber))
                .orElseThrow( ()-> new IllegalStateException("상품 이미지 조회 결과 없음!"));
    }

}
