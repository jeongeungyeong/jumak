package com.example.jumak.controller.main;

import com.example.jumak.domain.vo.main.ProductSearchVo;
import com.example.jumak.service.main.MainService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@Controller
@RequiredArgsConstructor
@RequestMapping("/")
public class MainController {
    private final MainService mainService;

    @GetMapping("/")
    public String mainPage(){
        return "main/main";
    }

    //    임시 이동경로
    @GetMapping("/search")
    public String searchPage(String keyword, Model model){
        List<ProductSearchVo> searchList = mainService.findSearch(keyword);
        model.addAttribute(searchList);
        model.addAttribute("keyword",keyword);
        return "product/search";
    }

}
