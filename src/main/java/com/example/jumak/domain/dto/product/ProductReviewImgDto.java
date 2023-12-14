package com.example.jumak.domain.dto.product;

import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.stereotype.Component;

@NoArgsConstructor
@Data
@Component
public class ProductReviewImgDto {
    private Long productReviewImgNumber;
    private String productReviewImgName;
    private String productReviewImgPath;
    private String productReviewImgUuid;
    private Long productReviewNumber;
}
