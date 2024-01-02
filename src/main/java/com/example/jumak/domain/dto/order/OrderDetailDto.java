package com.example.jumak.domain.dto.order;

import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.stereotype.Component;

@Component
@Data
@NoArgsConstructor
public class OrderDetailDto {
    private Long orderDetailNumber;
    private Long orderDetailCount;
    private Long productNumber;
    private Long orderNumber;
}
