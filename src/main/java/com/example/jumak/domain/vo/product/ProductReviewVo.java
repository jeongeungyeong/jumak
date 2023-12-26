package com.example.jumak.domain.vo.product;

import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.stereotype.Component;

@Component
@Data
@NoArgsConstructor
public class ProductReviewVo {
    private Long productReviewNumber;
    private String productReviewTitle;
    private String productReviewContent;
    private Long productReviewScore;
    private String productReviewDate;
    private Long userNumber;
    private Long productNumber;
    private Long productReviewImgNumber;
    private String productReviewImgName;
    private String productReviewImgPath;
    private String productReviewImgUuid;
}
