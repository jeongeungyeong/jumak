package com.example.jumak.controller.product;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequiredArgsConstructor
@RequestMapping("/store")
public class ProductController {
    //    스토어 상품 전체 보기
    @GetMapping("/main")
    public String product(){
        return "product/storeproduct";
    }
    //    상품 카테고리

    //    상품 디테일
    @GetMapping("/detail")
    public String detail(){
        return "product/storeproductdetail" ;
    }


    //  상품 장바구니 담기

    //  상품 주문버튼
}
