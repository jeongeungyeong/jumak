package com.example.jumak.domain.vo.madang;

import lombok.Data;
import org.springframework.stereotype.Component;

@Component
@Data
public class MadangReplyVo {
    private Long madangReplyNumber;
    private String madangReplyContent;
    private String madangReplyDate;
    private Long userNumber;
    private Long madangNumber;
    private String userNickname;
}
