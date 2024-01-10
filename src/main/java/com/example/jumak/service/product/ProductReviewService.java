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

    public void reviewRegister(ProductReviewVo productReviewDto){
        productReviewMapper.reviewInsert(productReviewDto);
    }

    public List<ProductReviewVo> findReviewList(Long productNumber){
        return productReviewMapper.reviewList(productNumber);
    }

    public void reviewModify(ProductReviewDto productReviewDto){
        productReviewMapper.reviewUpdate(productReviewDto);
    }

    public void reviewRemove(Long productReviewNumber){
        productReviewMapper.reviewDelete(productReviewNumber);
    }

    public int findTotal(Long productNumber){
        return productReviewMapper.selectTotal(productNumber);
    }

    public List<ProductReviewVo> findListPage(Criteria criteria, Long productNumber){
        return productReviewMapper.selectListPage(criteria, productNumber);
    }



}
