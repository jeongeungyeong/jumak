package com.example.jumak.service.main;

import com.example.jumak.domain.dto.product.ProductDto;
import com.example.jumak.domain.vo.main.BreweryVo;
import com.example.jumak.domain.vo.main.MadangListVo;
import com.example.jumak.domain.vo.main.ProductSearchVo;
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

    //    양조장탐방기
    public List<BreweryVo> brewery() { return mainMapper.brewery(); }

    //    수상한 마당
    public List<MadangListVo> madang() { return mainMapper.madang(); }

    //    나만의 술찾기
    public List<ProductSearchVo> findTag(Integer[] arr,
                                    Long productCategoryNumber1){
        int count = arr.length;
        Long productCategoryNumber2 = productCategoryNumber1+1L;
        return mainMapper.selectTag(arr, count, productCategoryNumber1,productCategoryNumber2);
    }
}
