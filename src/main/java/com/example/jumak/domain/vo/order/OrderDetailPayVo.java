package com.example.jumak.domain.vo.order;

import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
public class OrderDetailPayVo {
    private Long orderDetailNumber;
    private Long orderDetailCount;
    private Long productNumber;
    private Long orderNumber;
    private String productName;
    private Long productPrice;
}
