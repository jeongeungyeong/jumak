package com.example.jumak.domain.dto.news;

import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.stereotype.Component;

@Component
@Data
@NoArgsConstructor
public class NewsDto {
    private Long newsNumber;
    private String newsTitle;
    private String newsContent;
    private String newsDate;
    private Long newsCategoryNumber;
    private Long userNumber;
}
