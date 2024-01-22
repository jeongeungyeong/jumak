package com.example.jumak.domain.dto.order;

import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.stereotype.Component;

@Data
@NoArgsConstructor
public class OrderReviewDto {
    private Long orderReviewNumber;
    private String orderReviewTitle;
    private String orderReviewContent;
    private Long orderReviewScore;
    private String orderReviewDate;
    private Long userNumber;
    private Long orderDetailNumber;
}
