package com.example.jumak.domain.vo.order;

import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.stereotype.Component;

@Component
@Data
@NoArgsConstructor
public class OrderVo {
    private Long orderNumber;
    private Long paymentNumber;
    private Long paymentTotal;
    private Long orderStatusNumber;
    private String orderStatusName;
}
