package com.example.jumak.mapper.admin.aproduct;


import com.example.jumak.domain.dto.product.ProductImgDto;
import com.example.jumak.domain.dto.product.ProductImgMainDto;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface AProductImgMapper {
//    이미지사진파일 등록
    public void insert(ProductImgDto productImgDto);

//    이미지
    public ProductImgDto selectOne(Long productNumber);
}
