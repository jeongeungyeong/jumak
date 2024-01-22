package com.example.jumak.controller.product;

import com.example.jumak.domain.vo.product.Criteria;
import com.example.jumak.domain.vo.product.ProductInfoVo;
import com.example.jumak.service.product.ProductService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequiredArgsConstructor
@RequestMapping("/products")
public class ProductRestController {
/*    private final ProductService productService;

//    카테고리, 정렬 넘겨주기
    @GetMapping("/listview")
    public ProductInfoVo productView(@RequestParam(name = "orderCond") String orderCond,
                                     @RequestParam(name = "cate")String cate,
                                     Criteria criteria){
        criteria.setAmount(10);
        List<ProductInfoVo> productlist = productService.findByCond(orderCond, cate, criteria);

        return (ProductInfoVo) productlist;
    }*/

}
