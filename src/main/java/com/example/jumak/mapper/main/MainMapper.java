package com.example.jumak.mapper.main;

import com.example.jumak.domain.dto.product.ProductDto;
import com.example.jumak.domain.vo.main.BreweryVo;
import com.example.jumak.domain.vo.main.MadangListVo;
import com.example.jumak.domain.vo.main.ProductSearchVo;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;

@Mapper
public interface MainMapper {
// 상품 검색
    public List<ProductSearchVo> selectSearch(String keyword);

// 상품 검색 카운트
    public int countSearch(String keyword);

//    양조장 탐방기
    public List<BreweryVo> brewery();

//    수상한 마당
    public List<MadangListVo> madang();

// 나만의 술찾기
//    public List<ProductDto> selectTag(@Param("tag1") Long tag1,@Param("tag2") Long tag2
//            ,@Param("tag3") Long tag3);

    public List<ProductDto> selectTag(@Param("arr") Integer[] arr,@Param("count") int count,
                                      @Param("productCategoryNumber1") Long productCategoryNumber1,
                                      @Param("productCategoryNumber2") Long productCategoryNumber2);
}
