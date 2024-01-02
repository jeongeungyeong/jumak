package com.example.jumak.domain.vo.myPage;

import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.stereotype.Component;

@Component
@Data
@NoArgsConstructor
public class OrderStatusVo {
    private Long orderStatusNumber;
    private Long count;
}
