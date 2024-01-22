package com.example.jumak.domain.dto.product;

import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.stereotype.Component;


@Data
@NoArgsConstructor
public class ProductImgDto {
    private Long productImgNumber;
    private String productImgName;
    private String productImgPath;
    private String productImgUuid;
    private Long productNumber;
}
