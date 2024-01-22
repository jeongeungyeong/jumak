package com.example.jumak.domain.dto.order;

import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.stereotype.Component;


@Data
@NoArgsConstructor
public class OrderListDto {
    private Long orderListNumber;
    private Long orderNumber;
    private String orderListDate;
    private Long orderListTotalPrice;
    private Long orderListDiscountPrice;
    private Long orderListDeliveryPrice;
}
