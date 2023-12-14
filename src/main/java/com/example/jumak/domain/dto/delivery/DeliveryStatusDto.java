package com.example.jumak.domain.dto.delivery;

import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.stereotype.Component;

@Component
@Data
@NoArgsConstructor
public class DeliveryStatusDto {
    private Long deliveryStatusNumber;
    private String deliveryStatusName;
}

