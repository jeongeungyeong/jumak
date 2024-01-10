package com.example.jumak.domain.vo.madang;

import lombok.Data;
import org.springframework.stereotype.Component;

@Component
@Data
public class MadangReplyCountVo {
    private Long madangNumber;
    private Long replyCount;
    private Long recommendedCount;
}
