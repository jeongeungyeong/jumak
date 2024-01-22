package com.example.jumak.domain.vo.admin;

import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.stereotype.Component;


@Data
@NoArgsConstructor
public class AOrderVo {
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


    private String userName;
    private Long paymentTotalAmount;
    private String orderStatusName;
    private String paymentDeliveryFee;
}
