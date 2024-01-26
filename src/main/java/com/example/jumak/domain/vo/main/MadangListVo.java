package com.example.jumak.domain.vo.main;

import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.stereotype.Component;

@Data
@NoArgsConstructor
public class MadangListVo {
    private Long madangNumber;
    private String madangTitle;
    private String madangDate;

    private Long madangImgNumber;
    private String madangImgName;
    private String madangImgPath;
    private String madangImgUuid;

    private Long madangCategoryNumber;
    private String madangCategoryName;
}