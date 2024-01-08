package com.example.jumak.domain.vo.order;

import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.stereotype.Component;

@Component
@Data
@NoArgsConstructor
public class OrderVo {
//    주문번호
private Long orderNumber;
//회원번호
private Long userNumber;
//수령인
    private String orderRecipient;
//    수령인 우편번호
    private Long orderZipcode;
//    수령인주소
    private String orderAddress;
//    수령인 상세주소
    private String orderAddressDetail;
//    수령인 휴대폰번호
    private String orderCellphoneNumber;
//    수령인번호
    private String orderPhoneNumber;
//    주문시점
    private String orderDate;
//    주문상태번호
    private Long orderStatusNumber;
//    주문자 이름
private String userName;
//주문자 이메일
private String userEmail;
//주문자 휴대폰번호
private String userCellphoneNumber;
//주문자 전화번호
private String userPhoneNumber;
//주문자 주소
private String userAddress;
//주문자 상세주소
private String userAddressDetail;
//주문자 우편번호
private Long userZipcode;
//주문 상세번호
private Long orderDetailNumber;
//상품번호
private Long productNumber;
//주문 상품 개수
private Long orderDetailCount;
//결제번호
private Long paymentNumber;
//결제시간
private String paymentDate;
//총 상품금액
private Long paymentTotalAmount;
//할인금액
private Long paymentTotalDiscount;
//최종결제금액
private Long paymentTotal;


}
