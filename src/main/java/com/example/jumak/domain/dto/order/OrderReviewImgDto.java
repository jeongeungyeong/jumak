package com.example.jumak.domain.dto.order;

import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.stereotype.Component;

@Component
@Data
@NoArgsConstructor
public class OrderReviewImgDto {
    private Long orderReviewImgNumber;
    private String orderReviewImgName;
    private String orderReviewImgPath;
    private String orderReviewImgUuid;
    private Long orderReviewNumber;
}
