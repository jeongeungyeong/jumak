package com.example.jumak.mapper.admin.aproduct;


import com.example.jumak.domain.dto.product.ProductDto;
import com.example.jumak.domain.dto.product.ProductImgMainDto;
import com.example.jumak.domain.vo.admin.ACriteria;
import com.example.jumak.domain.vo.admin.AProductVo;
import com.example.jumak.domain.vo.admin.ASearchVo;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;
import java.util.Optional;

@Mapper
public interface AProductImgMainMapper {
//    대표이미지사진파일 등록
    public void insert(ProductImgMainDto productImgMainDto);

//    대표이미지
    public ProductImgMainDto selectOne(Long productNumber);
}
