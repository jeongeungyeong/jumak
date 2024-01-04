package com.example.jumak.controller.product;

import com.example.jumak.domain.dto.product.ProductReviewDto;
import com.example.jumak.domain.vo.product.ProductReviewVo;
import com.example.jumak.service.product.ProductReviewService;
import jakarta.servlet.http.HttpServletRequest;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequiredArgsConstructor
@RequestMapping("/reviews")
public class ProductReviewController {
    private final ProductReviewService productReviewService;

    @PostMapping
    public void write(@RequestBody ProductReviewDto productReviewDto,
                      HttpServletRequest req){
        Long userNumber = (Long) req.getSession().getAttribute("userNumber");

        productReviewDto.setUserNumber(userNumber);
        System.out.println("productReviewDto = " + productReviewDto);
        productReviewService.reviewRegister(productReviewDto);
    }

    //    url로 데이터를 넘겨받아 조회가 가능하다.
    //     경로상의 데이터를 받기 위해서는 @PathVariable 을 사용한다.
    @GetMapping("/store/view/{productNumber}")
    public List<ProductReviewVo> replyList(@PathVariable("productNumber") Long productNumber){
        return productReviewService.findReviewList(productNumber);
    }

    @PatchMapping("/{productReviewNumber}")
    public void replyModify(@PathVariable("productReviewNumber") Long productReviewNumber,
                            @RequestBody ProductReviewDto productReviewDto){
        System.out.println("productReviewNumber = " + productReviewNumber + ", productReviewDto = " + productReviewDto);
        productReviewDto.setProductReviewNumber(productReviewNumber);
        productReviewService.reviewModify(productReviewDto);
    }

    @DeleteMapping("/{productReviewNumber}")
    public void replyRemove(@PathVariable("productReviewNumber") Long productReviewNumber){
        productReviewService.reviewRemove(productReviewNumber);
    }


}
