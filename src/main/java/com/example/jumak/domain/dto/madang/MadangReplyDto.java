package com.example.jumak.domain.dto.madang;

import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.stereotype.Component;

@Component
@Data
@NoArgsConstructor
public class MadangReplyDto {
    private Long madangReplyNumber;
    private String madangReplyContent;
    private String madangReplyDate;
    private Long userNumber;
    private Long madangNumber;
}
