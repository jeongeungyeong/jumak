package com.example.jumak.domain.vo.admin;

import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.stereotype.Component;


@Data
@NoArgsConstructor
public class AOrderDetailVo {
    private Long orderDetailNumber;
    private Long orderDetailCount;
    private Long productNumber;
    private Long orderNumber;
    private String productName;
    private Long productPrice;
}
