package com.example.jumak.mapper.admin.aproduct;


import com.example.jumak.domain.dto.product.ProductDto;
import com.example.jumak.domain.vo.admin.ACriteria;
import com.example.jumak.domain.vo.admin.AProductVo;
import com.example.jumak.domain.vo.admin.ASearchVo;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;
import java.util.Optional;

@Mapper
public interface AProductMapper {
//    물품 단건상세
    public Optional<AProductVo> selectOne(Long productNumber);

//    물품 리스트
    public List<ProductDto> selectAll(ACriteria aCriteria);

//    물품 카운트
    public int selectTotal();

//    검색어로 조회
    public List<ProductDto> selectSearch(@Param("searchVo") ASearchVo aSearchVo,
                                         @Param("criteria") ACriteria aCriteria);

//    search total
    public int selectSearchTotal(@Param("searchVo") ASearchVo aSearchVo);

//    물품 삭제
    public void delete(Long productNumber);

//    물품 등록
    public void insert(ProductDto productDto);
}
