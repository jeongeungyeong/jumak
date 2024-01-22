package com.example.jumak.domain.dto.madang;

import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.stereotype.Component;

@Data
@NoArgsConstructor
public class MadangImgDto {
    private Long madangImgNumber;
    private String madangImgName;
    private String madangImgPath;
    private String madangImgUuid;
    private Long madangNumber;
}
