package com.example.jumak.mapper.madang;

import com.example.jumak.domain.dto.madang.MadangDto;
import com.example.jumak.domain.vo.madang.MadangDetailVo;
import com.example.jumak.domain.vo.madang.MadangVo;
import com.example.jumak.domain.vo.product.Criteria;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;
import java.util.Optional;

@Mapper
public interface MadangMapper {
//    마당 삽입
    void insert(MadangDto madangDto);

//    마당 리스트 조회(카테고리별)
    List<MadangVo> selectListByCate(@Param("madangCategoryNumber") Long madangCategoryNumber, @Param("criteria") Criteria criteria);

//    마당 토탈 카운트(카테고리별)
    int selectTotal(Long madangCategoryNumber);

//    마당 상세보기
    Optional<MadangDetailVo> selectDetail(Long madangNumber);

//    마당 조회수 증가
    void updateViewCount(Long madangNumber);
}













