package com.example.jumak.controller.product;

import com.example.jumak.domain.dto.product.ProductReviewDto;
import com.example.jumak.service.product.ProductReviewService;
import jakarta.servlet.http.HttpServletRequest;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
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

}
