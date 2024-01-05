package com.example.jumak.domain.vo.madang;

import lombok.Data;
import org.springframework.stereotype.Component;

@Component
@Data
public class MadangVo {
    Long madangNumber;
    Long madangCategoryNumber;
    String madangCategoryName;
    String madangTitle;
    Integer madangCount;
    String madangDate;
    String userNickname;
    Long userNumber;
    Integer recommendedCount;
}
