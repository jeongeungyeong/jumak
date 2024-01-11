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
public class ProductReviewRestController {
    private final ProductReviewService productReviewService;

    @GetMapping("/store/view/{productNumber}")
    public List<ProductReviewVo> reviewList(@PathVariable("productNumber") Long productNumber){
        return productReviewService.findListByProductNumber(productNumber);
    }

    @PostMapping
    public void replyWrite(@RequestBody ProductReviewDto productReviewDto,
                           @SessionAttribute("userNumber") Long userNumber){
        productReviewDto.setUserNumber(userNumber);
        productReviewService.register(productReviewDto);
    }

}
