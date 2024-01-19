package com.example.jumak.controller.product;

import com.example.jumak.domain.vo.product.Criteria;
import com.example.jumak.domain.vo.product.PageVo;
import com.example.jumak.domain.vo.product.ProductInfoVo;
import com.example.jumak.service.product.ProductService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@Controller
@RequestMapping("/product")
public class ProductController {
    private ProductService productService;

    //    우리술 전체보기
    @GetMapping("/list")
    public String productInfo(Model model){
        List<ProductInfoVo> groupOneList = productService.findGroupOne();
        model.addAttribute("groupone",groupOneList);
        return "product/product_info_main";
    }

/*    @GetMapping("/list")
    public String productInfo(Model model,Long productCategoryNumber){
        List<ProductInfoVo> productCateList = productService.findGroupCate(productCategoryNumber);
        model.addAttribute("cateproduct",productCateList);

        return "product/product_info_main";

    }*/

    // 우리술 상품보기
    @GetMapping("/view")
    public String productList(String orderCond, String cate, Criteria criteria, Model model){
        criteria.setAmount(10);
        List<ProductInfoVo> productlist = productService.findByCond(orderCond, cate, criteria);
        model.addAttribute("products",productlist);
        model.addAttribute("orderCond",orderCond);
        model.addAttribute("cate",cate);
        model.addAttribute("pageInfo", new PageVo(productService.findTotalByCond(cate).intValue(),criteria));
        return "product/product_info_list";}
    
    //우리술 상품 디테일
    @GetMapping("/detail")
    public String productDetail(){
        return "product/product_info_detail";
    }
}
