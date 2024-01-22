package com.example.jumak.domain.dto.qa;

import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.stereotype.Component;

@NoArgsConstructor
@Data

public class QaDto {
    private Long qaNumber;
    private String qaTitle;
    private String qaContent;
    private String qaDate;
    private String qaReply;
    private String qaReplyDate;
    private Long qaCategoryNumber;
    private Long userNumber;
}
