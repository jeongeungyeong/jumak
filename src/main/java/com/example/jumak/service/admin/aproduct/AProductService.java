package com.example.jumak.service.admin.aproduct;

import com.example.jumak.domain.dto.product.ProductDto;
import com.example.jumak.domain.vo.admin.ACriteria;
import com.example.jumak.domain.vo.admin.AProductVo;
import com.example.jumak.domain.vo.admin.ASearchVo;
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
    public AProductVo findOne(Long productNumber){
        return aProductMapper.selectOne(productNumber).orElseThrow(()->
                new IllegalStateException("존재하지 않는 product 정보"));
    }

//    물품 리스트
    public List<ProductDto> findAll(ACriteria aCriteria){
        return aProductMapper.selectAll(aCriteria);
    }

//    물품 카운트
    public int findTotal(){
        return aProductMapper.selectTotal();
    }

//    검색어 조회
    public List<ProductDto> findSearch(ASearchVo aSearchVo, ACriteria aCriteria){
        return aProductMapper.selectSearch(aSearchVo, aCriteria);
    }

//    search total
    public int findSearchTotal(ASearchVo aSearchVo){
        return aProductMapper.selectSearchTotal(aSearchVo);
    }

    //    물품 삭제
    public void remove(Long productNumber){
        aProductMapper.delete(productNumber);
    }

    //    물품 등록
    public void register(ProductDto productDto){
        aProductMapper.insert(productDto);
    }

//    물품 수정
    public void modify(ProductDto productDto){aProductMapper.update(productDto);}

    //    물품 수정용 단건 조회 쿼리
    public ProductDto findOneUpdate(Long productNumber){
        return aProductMapper.selectOneUpdate(productNumber);
    }
}
