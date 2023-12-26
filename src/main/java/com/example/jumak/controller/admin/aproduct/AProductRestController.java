package com.example.jumak.controller.admin.aproduct;


import com.example.jumak.service.admin.aproduct.AProductService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequiredArgsConstructor
@RequestMapping("/admin/product")
public class AProductRestController {

    private final AProductService aProductService;

    @DeleteMapping("/delete/{productNumber}")
    public void productRemove(@PathVariable("productNumber") Long productNumber){
//        aProductService.re
    }
}
