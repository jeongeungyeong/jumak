package com.example.jumak.domain.dto.madang;

import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.stereotype.Component;

@Component
@Data
@NoArgsConstructor
public class MadangCategoryDto {
    private Long madangCategoryNumber;
    private String madangCategoryName;
}
