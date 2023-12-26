package com.example.jumak.service.admin.aproduct;

import com.example.jumak.domain.dto.product.ProductDto;
import com.example.jumak.domain.vo.admin.Criteria;
import com.example.jumak.domain.vo.admin.ProductVo;
import com.example.jumak.domain.vo.admin.SearchVo;
import com.example.jumak.mapper.admin.aproduct.AProductMapper;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
@Transactional
@RequiredArgsConstructor
public class AProductService {
    private final AProductMapper aProductMapper;

//    물품 단건상세
    public ProductVo findOne(Long productNumber){
        return aProductMapper.selectOne(productNumber).orElseThrow(()->
                new IllegalStateException("존재하지 않는 product 정보"));
    }

//    물품 리스트
    public List<ProductDto> findAll(Criteria criteria){
        return aProductMapper.selectAll(criteria);
    }

//    물품 카운트
    public int findTotal(){
        return aProductMapper.selectTotal();
    }

//    검색어 조회
    public List<ProductDto> findSearch(SearchVo searchVo, Criteria criteria){
        return aProductMapper.selectSearch(searchVo,criteria);
    }

//    search total
    public int findSearchTotal(SearchVo searchVo){
        return aProductMapper.selectSearchTotal(searchVo);
    }
}
