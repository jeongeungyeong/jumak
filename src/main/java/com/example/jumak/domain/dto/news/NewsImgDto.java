package com.example.jumak.domain.dto.news;

import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.stereotype.Component;

@Data
@NoArgsConstructor
public class NewsImgDto {
    private Long newsImgNumber;
    private String newsImgName;
    private String newsImgPath;
    private String newsImgUuid;
    private Long newsNumber;
}
