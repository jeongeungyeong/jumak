package com.example.jumak.controller.admin.aproduct;

import com.example.jumak.domain.dto.product.ProductDto;
import com.example.jumak.domain.vo.admin.ACriteria;
import com.example.jumak.domain.vo.admin.APageVo;
import com.example.jumak.domain.vo.admin.AProductVo;
import com.example.jumak.domain.vo.admin.ASearchVo;
import com.example.jumak.service.admin.aproduct.AProductService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.view.RedirectView;

import java.util.List;

@Controller
@RequiredArgsConstructor
@RequestMapping("/admin/product")
public class AProductController {
    private final AProductService aProductService;

    @GetMapping
    public String productList(ACriteria aCriteria, Model model){
        List<ProductDto> productList = aProductService.findAll(aCriteria);
        model.addAttribute("productList", productList);
        model.addAttribute("pageInfo", new APageVo(aProductService.findTotal(), aCriteria));
        return "admin/product/productList";
    }

    @GetMapping("/detail/{productNumber}")
    public String productDetail(@PathVariable("productNumber") Long productNumber,
                                Model model){
        AProductVo productDetail = aProductService.findOne(productNumber);
        model.addAttribute("product",productDetail);
        return "admin/product/productDetail";
    }

    @GetMapping("/search")
    public String searchResult(ASearchVo aSearchVo, ACriteria aCriteria, Model model){
        List<ProductDto> searchDto = aProductService.findSearch(aSearchVo, aCriteria);

        model.addAttribute("productList", searchDto);
        model.addAttribute("searchVo", aSearchVo);
        model.addAttribute("pageInfo", new APageVo(aProductService.findSearchTotal(aSearchVo), aCriteria));
        return "admin/product/productListSearch";
    }

    @GetMapping("/add")
    public String productAdd(){
        return "admin/product/productAdd";
    }

    @PostMapping("/add")
    public RedirectView productAdd(ProductDto productDto){
        productDto.setProductSales(0L);
        aProductService.register(productDto);

        return new RedirectView("/admin/product");
    }
}
