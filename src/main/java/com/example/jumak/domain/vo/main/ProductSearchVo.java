package com.example.jumak.domain.vo.main;

import lombok.Data;
import org.springframework.stereotype.Component;


@Data
public class ProductSearchVo {
    private Long productImgMainNumber;
    private String productImgMainName;
    private String productImgMainPath;
    private String productImgMainUuid;
    private Long productNumber;
    private String productName;
    private String productSubtitle;
    private Long productDiscount;
    private Long productPrice;
}
