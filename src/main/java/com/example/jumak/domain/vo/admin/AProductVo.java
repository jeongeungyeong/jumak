package com.example.jumak.domain.vo.admin;

import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.stereotype.Component;

@Component
@Data
@NoArgsConstructor
public class AProductVo {
    private Long productNumber;
    private Long productCategoryNumber;
    private String productName;
    private String productSubtitle;
    private String productRawMaterial;
    private Long productNetWeight;
    private String productAlcoholicity;
    private String productArea;
    private String productDescription;
    private Long productPrice;
    private Long productInventory;
    private Long productSales;
    private Long productDiscount;
    private String productReleaseDate;
    private String productDistillery;
    private String productCategoryName;
}
