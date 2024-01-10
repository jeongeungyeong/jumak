package com.example.jumak.domain.vo.myPage;

import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.stereotype.Component;

@Component
@Data
@NoArgsConstructor
public class InquiryVo {
    private Long userNumber;
    private String qaNumber;
    private String qaDate;
    private String qaCategoryName;
    private String qaTitle;
    private String qaReply;
    private String qaReplyDate;

    private String startDate;
    private String endDate;
}
