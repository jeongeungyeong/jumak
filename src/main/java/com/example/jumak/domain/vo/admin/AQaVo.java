package com.example.jumak.domain.vo.admin;

import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.stereotype.Component;

@NoArgsConstructor
@Data

public class AQaVo {
    private Long qaNumber;
    private String qaTitle;
    private String qaContent;
    private String qaDate;
    private String qaReply;
    private String userName;
    private String qaCategoryName;
}
