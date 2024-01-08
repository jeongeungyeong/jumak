package com.example.jumak.mapper.main;

import com.example.jumak.domain.dto.user.UserDto;
import com.example.jumak.domain.vo.main.ProductSearchVo;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface MainMapper {
// 상품 검색
    public List<ProductSearchVo> selectSearch(String keyword);

// 상품 검색 카운트
    public int countSearch(String keyword);
}
