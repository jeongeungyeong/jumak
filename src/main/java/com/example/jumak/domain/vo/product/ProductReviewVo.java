package com.example.jumak.domain.vo.product;

import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.stereotype.Component;


@Data
@NoArgsConstructor
public class ProductReviewVo {
    //    상품 리뷰
    private Long productReviewNumber;
    private String productReviewTitle;
    private String productReviewContent;
    private Long productReviewScore;
    private String productReviewDate;
    //    회원번호
    private Long userNumber;
    //    회원 닉네임
    private String userNickname;
}
