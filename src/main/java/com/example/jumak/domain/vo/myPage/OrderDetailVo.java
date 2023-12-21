package com.example.jumak.domain.vo.myPage;

import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.stereotype.Component;

@Component
@Data
@NoArgsConstructor
public class OrderDetailVo {
    private Long orderNumber;
    private String orderDate;
    private Long orderStatusNumber;
    private String orderStatusName;
    private Long orderDetailCount;
    private Long orderDetailNumber;
    private String productName;
    private Long productPrice;
    private Long userNumber;
    private Long orderReviewCount;
}
