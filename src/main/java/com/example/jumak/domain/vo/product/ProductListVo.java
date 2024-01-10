package com.example.jumak.domain.vo.product;

import lombok.Data;
import org.springframework.stereotype.Component;

@Component
@Data
public class    ProductListVo {
    private Long productImgMainNumber;
    private String productImgMainName;
    private String productImgMainPath;
    private String productImgMainUuid;
    private Long productNumber;
    private Long productCategoryNumber;
    private String productName;
    private Long productNetWeight;
    private Long productAlcoholicity;
    private Long productPrice;
    private Long productDiscount;
    private Long productSales;
    private String productReleaseDate;
}
