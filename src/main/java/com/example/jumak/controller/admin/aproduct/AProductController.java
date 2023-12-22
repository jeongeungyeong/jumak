package com.example.jumak.controller.admin.aproduct;

import com.example.jumak.domain.dto.product.ProductDto;
import com.example.jumak.domain.vo.admin.Criteria;
import com.example.jumak.domain.vo.admin.PageVo;
import com.example.jumak.domain.vo.admin.ProductVo;
import com.example.jumak.domain.vo.admin.SearchVo;
import com.example.jumak.service.admin.aproduct.AProductService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@Controller
@RequiredArgsConstructor
@RequestMapping("/admin/product")
public class AProductController {
    private final AProductService aProductService;

    @GetMapping
    public String productList(Criteria criteria, Model model){
        List<ProductDto> productList = aProductService.findAll(criteria);
        model.addAttribute("productList", productList);
        model.addAttribute("pageInfo", new PageVo(aProductService.findTotal(), criteria));
        return "admin/product/productList";
    }

    @GetMapping("/detail/{productNumber}")
    public String productDetail(@PathVariable("productNumber") Long productNumber,
                                Model model){
        ProductVo productDetail = aProductService.findOne(productNumber);
        model.addAttribute("product",productDetail);
        return "admin/product/productDetail";
    }

    @GetMapping("/search")
    public String searchResult(SearchVo searchVo , Criteria criteria, Model model){
        List<ProductDto> searchDto = aProductService.findSearch(searchVo,criteria);

        model.addAttribute("productList", searchDto);
        model.addAttribute("searchVo", searchVo);
        model.addAttribute("pageInfo", new PageVo(aProductService.findSearchTotal(searchVo),criteria));
        return "admin/product/productListSearch";
    }
}
