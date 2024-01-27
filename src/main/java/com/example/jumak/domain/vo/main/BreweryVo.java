package com.example.jumak.domain.vo.main;

import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
public class BreweryVo {
    private Long newsNumber;
    private String newsTitle;
    private String newsImgPath;
    private String newsImgUuid;
    private String newsDate;
    private String newsImgName;
}
