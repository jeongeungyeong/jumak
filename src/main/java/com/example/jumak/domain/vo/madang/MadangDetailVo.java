package com.example.jumak.domain.vo.madang;

import lombok.Data;
import org.springframework.stereotype.Component;

@Component
@Data
public class MadangDetailVo {
    private Long madangNumber;
    private String madangTitle;
    private String madangDate;
    private String madangContent;
    private Long madangCount;
    private Long userNumber;
    private String userNickname;
    private String madangCategoryName;
    private Long writeCount;
    private Long replyCount;
    private Long recommendedCount;
}
