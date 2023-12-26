package com.example.jumak.mapper.admin.aproduct;


import com.example.jumak.domain.dto.product.ProductDto;
import com.example.jumak.domain.vo.admin.Criteria;
import com.example.jumak.domain.vo.admin.ProductVo;
import com.example.jumak.domain.vo.admin.SearchVo;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;
import java.util.Optional;

@Mapper
public interface AProductMapper {
//    물품 단건상세
    public Optional<ProductVo> selectOne(Long productNumber);

//    물품 리스트
    public List<ProductDto> selectAll(Criteria criteria);

//    물품 카운트
    public int selectTotal();

//    검색어로 조회
    public List<ProductDto> selectSearch(@Param("searchVo") SearchVo searchVo,
                                         @Param("criteria") Criteria criteria);

//    search total
    public int selectSearchTotal(SearchVo searchVo);
}
