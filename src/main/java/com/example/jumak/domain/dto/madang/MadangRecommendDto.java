package com.example.jumak.domain.dto.madang;

import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.stereotype.Component;


@Data
@NoArgsConstructor
public class MadangRecommendDto {
    private Long madangNumber;
    private Long userNumber;
}
