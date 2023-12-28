package com.example.jumak.controller.product;

import com.example.jumak.service.product.ProductService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequiredArgsConstructor
@RequestMapping("/store")
public class ProductController {
    private final ProductService productService;

//    스토어 베스트 상품 보기
    @GetMapping("/best")
    public String productbest(){
        return "product/storebestproduct";
    }

    //    스토어 상품 전체 보기
    @GetMapping("/main")
    public String product(){
        return "product/storeproduct";
    }
    //    상품 카테고리

    //    상품 정렬

    //    상품 디테일
    @GetMapping("/view")
    public String detail(){
        return "product/storeproductdetail" ;
    }

    //  상품 장바구니 담기

    //  상품 주문버튼

}
