package com.example.jumak.controller.admin.aproduct;

import com.example.jumak.domain.dto.product.ProductDto;
import com.example.jumak.domain.vo.admin.ACriteria;
import com.example.jumak.domain.vo.admin.APageVo;
import com.example.jumak.domain.vo.admin.AProductVo;
import com.example.jumak.domain.vo.admin.ASearchVo;
import com.example.jumak.service.admin.aproduct.AProductImgMainService;
import com.example.jumak.service.admin.aproduct.AProductImgService;
import com.example.jumak.service.admin.aproduct.AProductService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.servlet.view.RedirectView;

import java.io.IOException;
import java.util.List;

@Controller
@RequiredArgsConstructor
@RequestMapping("/admin/product")
public class AProductController {
    private final AProductService aProductService;
    private final AProductImgMainService aProductImgMainService;
    private final AProductImgService aProductImgService;

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
    public RedirectView productAdd(ProductDto productDto,@RequestParam("productImgMain") List<MultipartFile> fileMain,
                                   @RequestParam("productImg") List<MultipartFile> file,
                                   @RequestParam("productKeywordNumber") List<Long> productKeywordNumber){
        System.out.println("productKeywordNumber = " + productKeywordNumber);
        productDto.setProductSales(0L);
        productDto.setProductDescription("");
        aProductService.register(productDto);
        Long productNumber = productDto.getProductNumber();


        aProductService.registerKeyword(productKeywordNumber,productNumber);

        try {
            aProductImgMainService.registerAndSaveFiles(fileMain, productNumber);
            aProductImgService.registerAndSaveFiles(file,productNumber);
        } catch (IOException e) {
            e.printStackTrace();
        }

        return new RedirectView("/admin/product");
    }

    @GetMapping("/modify/{productNumber}")
    public String productModify(@PathVariable("productNumber") Long productNumber, Model model){
        ProductDto findProduct = aProductService.findOneUpdate(productNumber);
        model.addAttribute("product",findProduct);
        return "admin/product/productModify";
    }

    @PostMapping("/modify")
    public RedirectView productModify(ProductDto productDto){
        aProductService.modify(productDto);
        return new RedirectView("/admin/product/detail/" + productDto.getProductNumber());
    }
}
