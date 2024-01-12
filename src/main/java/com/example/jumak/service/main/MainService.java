package com.example.jumak.service.main;

import com.example.jumak.domain.vo.main.ProductSearchVo;
import com.example.jumak.domain.vo.product.Criteria;
import com.example.jumak.domain.vo.product.ProductInfoVo;
import com.example.jumak.mapper.main.MainMapper;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
@Transactional
@RequiredArgsConstructor
public class MainService {
    private final MainMapper mainMapper;

//    상품 검색
    public List<ProductSearchVo> findSearch(String keyword){
        return mainMapper.selectSearch(keyword);
    }

//    상품 검색 카운트
    public int countSearch(String keyword){
        return mainMapper.countSearch(keyword);
    }

//    우리술 상품리스트
    public List<ProductInfoVo> findByCond(String orderCond, String cate, Criteria criteria){
        return mainMapper.selectByOrderCond(orderCond,cate,criteria);
    }

//    우리술 상품카운트
    public Long findTotalByCond(String cate){
        return mainMapper.selectTotalByCond(cate);
    }
}
