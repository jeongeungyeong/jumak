package com.example.jumak.service.product;

import com.example.jumak.domain.vo.product.Criteria;
import com.example.jumak.domain.vo.product.ProductVo;
import com.example.jumak.mapper.product.ProductMapper;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
@RequiredArgsConstructor
@Transactional
public class ProductService {
    private final ProductMapper productMapper;
    
//    메인 상세 정보 조회
    @Transactional(readOnly = true)
    public ProductVo find (Long productNumber){
        return productMapper.select(productNumber)
                .orElseThrow(()-> new IllegalStateException("존재하지 않는 상품 번호!"));
    }

//    리스트 조회
//    public List<ProductVo> findAll(Criteria criteria) {
//
//    }

//    총 게시물 수 조회
    public int findTotal(){return productMapper.selectTotal();}
}
