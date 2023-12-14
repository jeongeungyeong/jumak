package com.example.jumak.domain.dto.news;

import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.stereotype.Component;

@Data
@NoArgsConstructor
@Component
public class NewsCategoryDto {
    private Long newsCategoryNumber;
    private String newsCategoryName;
}
