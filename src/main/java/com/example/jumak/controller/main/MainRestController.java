package com.example.jumak.controller.main;

import com.example.jumak.service.main.MainService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequiredArgsConstructor
@RequestMapping("/find")
public class MainRestController {
    private final MainService mainService;

    @GetMapping("/tag")
    public void tagFind(@RequestParam("arr")Integer[] arr,
                        @RequestParam("productCategoryNumber1")Long productCategoryNumber1){
        mainService.findTag(arr,productCategoryNumber1);
    }
}
