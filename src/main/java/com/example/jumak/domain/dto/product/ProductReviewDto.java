package com.example.jumak.domain.dto.product;

import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.stereotype.Component;


@Data
@NoArgsConstructor
public class ProductReviewDto {
    private Long productReviewNumber;
    private String productReviewTitle;
    private String productReviewContent;
    private Long productReviewScore;
    private String productReviewDate;
    private Long userNumber;
    private Long productNumber;
}
