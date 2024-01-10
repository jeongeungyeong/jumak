package com.example.jumak.mapper.madang;

import com.example.jumak.domain.dto.madang.MadangCategoryDto;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface MadangCategoryMapper {
    List<MadangCategoryDto> selectAll();
}
