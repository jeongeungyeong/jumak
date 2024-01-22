package com.example.jumak.domain.vo.product;

import lombok.Data;
import org.springframework.stereotype.Component;


@Data
public class ProductDetailVo {
//    상품 번호
    private Long productNumber;
//    상품 종류
    private Long productCategoryNumber;
//    상품 종류 이름
private String productCategoryName;
//    상품 이름
    private String productName;
//    상품 용량
    private Long productNetWeight;
//    상품 도수
    private Long productAlcoholicity;
//    생산 지역
    private String productArea;
//    상품 가격
    private Long productPrice;
//    할인률
    private Long productDiscount;
//    양조장 이름
    private String productDistillery;
//    상품 메인 이미지
    private Long productImgMainNumber;
    private String productImgMainName;
    private String productImgMainPath;
    private String productImgMainUuid;
//    상품 디테일 이미지
    private Long productImgNumber;
    private String productImgName;
    private String productImgPath;
    private String productImgUuid;

}
