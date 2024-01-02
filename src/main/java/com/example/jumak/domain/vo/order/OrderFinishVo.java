package com.example.jumak.domain.vo.order;

import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.stereotype.Component;

@Component
@Data
@NoArgsConstructor
public class OrderFinishVo {
//    주문날짜
    private String orderDate;
//    회원번호
private Long userNumber;
//    주문번호
private Long orderNumber;
//    결제번호
private Long paymentNumber;
//   최종금액
private Long paymentTotal;
//결제 상태
private Long orderStatusNumber;
//결제 상태 이름
private String orderStatusName;
}
