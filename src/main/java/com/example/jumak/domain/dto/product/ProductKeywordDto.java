package com.example.jumak.domain.dto.product;

import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.stereotype.Component;


@Data
@NoArgsConstructor
public class ProductKeywordDto {
    private Long productKeywordNumber;
    private String productKeywordName;
}
