package com.example.jumak.domain.dto.madang;

import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.stereotype.Component;


@Data
@NoArgsConstructor
public class MadangDto {
    private Long madangNumber;
    private String madangTitle;
    private String madangContent;
    private String madangDate;
    private Long madangCount;
    private Long userNumber;
    private Long madangCategoryNumber;
}
