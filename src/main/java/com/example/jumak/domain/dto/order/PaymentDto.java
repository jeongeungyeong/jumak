package com.example.jumak.domain.dto.order;

import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.stereotype.Component;


@Data
@NoArgsConstructor
public class PaymentDto {
    private Long paymentNumber;
    private String paymentDate;
    private Long paymentTotalAmount;
    private Long paymentTotalDiscount;
    private Long paymentDeliveryFee;
    private Long paymentTotal;
    private Long orderNumber;
}
