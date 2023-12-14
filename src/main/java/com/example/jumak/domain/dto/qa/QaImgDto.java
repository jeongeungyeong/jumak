package com.example.jumak.domain.dto.qa;

import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.stereotype.Component;

@Component
@Data
@NoArgsConstructor
public class QaImgDto {
    private Long qaImgNumber;
    private String qaImgName;
    private String qaImgPath;
    private String qaImgUuid;
    private Long qaNumber;
}
