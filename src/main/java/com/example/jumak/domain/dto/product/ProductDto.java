package com.example.jumak.domain.dto.product;

import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.stereotype.Component;

@Component
@Data
@NoArgsConstructor
public class ProductDto {
    private Long productNumber;
    private Long productCategoryNumber;
    private String productName;
    private String productSubtitle;
    private String productRawMaterial;
    private Long productNetWeight;
    private Long productAlcoholicity;
    private String productArea;
    private String productDescription;
    private Long productPrice;
    private Long productInventory;
    private Long productSales;
    private Long productDiscount;
    private String productReleaseDate;
    private String productDistillery;
}
