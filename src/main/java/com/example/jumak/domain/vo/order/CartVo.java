package com.example.jumak.domain.vo.order;

import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.stereotype.Component;

@Data
@NoArgsConstructor
public class CartVo {
    private Long productNumber;
    private Long userNumber;
    private Long productCount;
    private String productName;
    private String productNetWeight;
    private Long productAlcoholicity;
    private Long productPrice;
    private Long productDiscount;
    private Long productImgMainNumber;
    private String productImgMainName;
    private String productImgMainPath;
    private String productImgMainUuid;

    public double getSalePrice(){
        return productPrice - (productPrice * (productDiscount/100.0));
    }
}
