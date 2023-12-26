package com.example.jumak.domain.vo.myPage;

import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.stereotype.Component;

@Component
@Data
@NoArgsConstructor
public class OrderDetailVo {
    private String orderDate;
    private Long orderNumber;
    private String productName;
    private Long productPrice;
    private Long orderDetailCount;
    private String orderStatusName;
    private Long ReviewCount;
}
