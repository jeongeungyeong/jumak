package com.example.jumak.controller.product;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/product/info")
public class ProductController {

    //    임시 이동경로
    @GetMapping("/main")
    public String productInfoMain(){
        return "product/product_info_main";
    }

    @GetMapping("/list")
    public String productInfoList(){
        return "product/product_info_list";
    }
}
