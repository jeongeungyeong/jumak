package com.example.jumak.controller.main;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class Main {
    @GetMapping("/")
    public String mainPage(){
        return "main/main";
    }

//    임시 이동경로
    @GetMapping("/goods/search")
    public String searchPage(){
        return "main/search";
    }

//    임시 이동경로
    @GetMapping("/order/cart")
    public String cartPage(){
        return "order/cart";
    }
}
