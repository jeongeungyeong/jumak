package com.example.jumak.domain.vo.product;

import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.stereotype.Component;


@Data
@NoArgsConstructor
public class ProductImgVo {
    private Long productImgNumber;
    private String productImgName;
    private String productImgPath;
    private String productImgUuid;
    private Long productNumber;
    private Long productImgMainNumber;
    private String productImgMainName;
    private String productImgMainPath;
    private String productImgMainUuid;
}
