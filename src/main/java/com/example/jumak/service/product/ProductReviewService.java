package com.example.jumak.service.product;

import com.example.jumak.domain.dto.product.ProductReviewDto;
import com.example.jumak.domain.vo.product.Criteria;
import com.example.jumak.domain.vo.product.ProductReviewVo;
import com.example.jumak.mapper.product.ProductReviewMapper;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
@Transactional
@RequiredArgsConstructor
public class ProductReviewService {
    private final ProductReviewMapper productReviewMapper;

//상품 후기 리스트 조회
    public List<ProductReviewVo> findListByProductNumber(Long productNumber){
        return productReviewMapper.selectListByProductNumber(productNumber);
    }

//    상품 후기 작성
    public void register(ProductReviewDto productReviewDto){productReviewMapper.insert(productReviewDto);}



}
