package com.example.jumak.controller.maDang;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/madang")
public class MaDangController {

//    임시 이동 처리
    @GetMapping("/list")
    public String madangList(){
        return "madang/madang-list";
    }

//    임시 이동 처리
    @GetMapping("/detail")
    public String madangDetail(){
        return "madang/madang-detail";
    }

//    임시 이동 처리
    @GetMapping("/write")
    public String madangWrite(){
        return "madang/madang-write";
    }
}












