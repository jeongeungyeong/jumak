package com.example.jumak.controller.main;

import com.example.jumak.domain.dto.product.ProductDto;
import com.example.jumak.service.main.MainService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.Arrays;
import java.util.List;

@RestController
@RequiredArgsConstructor
@RequestMapping("/find")
public class MainRestController {
    private final MainService mainService;

    @GetMapping("/tag")
    public List<ProductDto> tagFind(@RequestParam("arr")Integer[] arr,
                                    @RequestParam("productCategoryNumber1")Long productCategoryNumber1){

//        System.out.println("arr = " + Arrays.deepToString(arr) + ", productCategoryNumber1 = " + productCategoryNumber1);
        List<ProductDto> productList = mainService.findTag(arr, productCategoryNumber1);

        return productList;
    }
}
