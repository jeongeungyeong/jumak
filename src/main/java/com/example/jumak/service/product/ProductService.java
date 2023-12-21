package com.example.jumak.service.product;

import com.example.jumak.domain.dto.product.ProductDto;
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
    
//    상품 리스트 조회
    public List<ProductVo> productsGetList(){
        return productMapper.productsGetList();
    }
//    총 게시물 수 조회
    public int findTotal(){return productMapper.selectTotal();}
}
