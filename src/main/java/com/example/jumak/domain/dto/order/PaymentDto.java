package com.example.jumak.domain.dto.order;

import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.stereotype.Component;

@Component
@Data
@NoArgsConstructor
public class PaymentDto {
    private Long paymentNumber;
    private String paymentDate;
    private Long paymentTotalPrice;
    private Long paymentDiscountAmount;
    private Long paymentDeliveryCharge;
    private String paymentStatus;
    private Long orderNumber;
}
