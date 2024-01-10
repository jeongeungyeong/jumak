package com.example.jumak.controller.product;

import com.example.jumak.domain.dto.product.ProductDto;
import com.example.jumak.domain.vo.product.ProductListVo;
import com.example.jumak.domain.vo.product.ProductVo;
import com.example.jumak.service.product.ProductService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@Controller
@RequiredArgsConstructor
@RequestMapping("/store")
public class ProductController {
    private final ProductService productService;

    @GetMapping("/list")
    public String productList(String orderCond, String cate, Model model){
        List<ProductListVo> productList = productService.findByCond(orderCond, cate);
        model.addAttribute("products", productList);
        model.addAttribute("orderCond", orderCond);
        model.addAttribute("cate", cate);

        return "product/storeproduct";
    }



    //    스토어 상품 전체 보기
    @GetMapping("/all")
    public String productall(Model model){
        List<ProductListVo> productlist = productService.findAll();
        model.addAttribute("products",productlist);

        return "product/storeproduct";
    }

//    상품 디테일 테스트
    @GetMapping("/testing")
    public String testing(){return "product/storeproductdetailtest" ; }

    //    상품 디테일
    @GetMapping("/view")
    public String detail(){
        return "product/storeproductdetail" ;
    }

    //  상품 장바구니 담기

    //  상품 주문버튼



}
