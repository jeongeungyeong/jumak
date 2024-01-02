package com.example.jumak.controller.admin.anews;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequiredArgsConstructor
@RequestMapping("/admin/news")
public class ANewsController {

    @GetMapping("/add")
    public String addNews(){
        return "admin/board/newsAdd";
    }
}
