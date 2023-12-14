package com.example.jumak.domain.dto.order;

import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.stereotype.Component;

@Component
@Data
@NoArgsConstructor
public class OrderStatusDto {
    private Long orderStatusNumber;
    private String orderStatusName;
}
