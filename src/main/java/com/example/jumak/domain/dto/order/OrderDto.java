package com.example.jumak.domain.dto.order;

import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.stereotype.Component;

@Component
@Data
@NoArgsConstructor
public class OrderDto {
    private Long orderNumber;
    private Long userNumber;
    private String orderRecipient;
    private Long orderZipcode;
    private String orderAddress;
    private String orderAddressDetail;
    private String orderCellphoneNumber;
    private String orderPhoneNumber;
    private String orderDate;
    private Long orderStatusNumber;
    private Long deliveryStatusNumber;
}
