package com.example.jumak.domain.dto.delivery;

import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.stereotype.Component;

@Component
@Data
@NoArgsConstructor
public class DeliveryAddressDto {
    private Long addressNumber;
    private Long userNumber;
    private String addressName;
    private String addressRecipient;
    private String address;
    private String AddressDetail;
    private Long addressZipcode;
    private String addressCellphoneNumber;
    private String addressPhoneNumber;
    private String addressDefault;
}
