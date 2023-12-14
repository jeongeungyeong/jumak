package com.example.jumak.domain.dto.qa;

import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.stereotype.Component;

@NoArgsConstructor
@Data
@Component
public class QaDto {
    private Long qaNumber;
    private String qaTitle;
    private String qaContent;
    private String qaDate;
    private String qaReply;
    private Long userNumber;
}
