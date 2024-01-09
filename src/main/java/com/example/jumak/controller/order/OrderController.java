package com.example.jumak.controller.order;

import com.example.jumak.domain.dto.order.OrderDto;
import com.example.jumak.domain.dto.product.ProductDto;
import com.example.jumak.domain.dto.user.UserDto;
import com.example.jumak.domain.vo.order.OrderFinishVo;
import com.example.jumak.domain.vo.order.OrderVo;
import com.example.jumak.domain.vo.product.ProductDetailVo;
import com.example.jumak.service.order.OrderService;
import com.example.jumak.service.product.ProductService;
import jakarta.servlet.http.HttpServletRequest;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Controller
@RequiredArgsConstructor
@RequestMapping("order")
public class OrderController {
    private final OrderDto orderDto;
    private final OrderService orderService;
    private final ProductService productService;


    @GetMapping("/next")
    public String orderMain(@RequestParam("productNumber") Long productNumber,
                            @RequestParam("productCount") Long productCount,
                            HttpServletRequest req,
                            Model model){
// productNumber 로 next페이지에 넘겨줄 정보 서비스에서 뽑아서 넘겨주고
//        productCount 는 그냥 넘겨주기
        ProductDetailVo productDetail = productService.findByDNumber(productNumber);

        model.addAttribute("productDetail",productDetail);
        model.addAttribute("productCount",productCount);
        // productCount는 ${productCount}로 html에 사용
        //        상품 토탈 가격
        model.addAttribute("totalPrice", productCount * productDetail.getProductPrice());
//        페이먼트 토탈 가격 (배송비+3000원)
        model.addAttribute("paymentTotal", (productCount *(productDetail.getProductPrice() - (productDetail.getProductPrice() *(productDetail.getProductDiscount()/100.0))))
                +3000);

        //주문자정보 사용자정보뿌리기 매퍼에서부터 찾아서
        Object userNumber = req.getSession().getAttribute("userNumber");

        //오더서비스연결해서 모델로 뿌리기
        OrderVo byUNumber = null;

        byUNumber = orderService.findByUNumber((Long) userNumber);

        model.addAttribute("orderUInfo",byUNumber);
        
        return "order/storeorder";
    }


    @GetMapping("/fail")
    public String orderFail(Model model){
        List<OrderFinishVo> orderFinList = orderService.findByNumber();
        model.addAttribute("finalorders",orderFinList);
        return "order/storeorderfail";
    }

    //    임시 이동경로
    @GetMapping("/cart")
    public String cartPage(){
        return "order/cart";
    }

    @GetMapping("/success")
    public String orderSuccess(Model model){
        List<OrderFinishVo> orderFinList = orderService.findByNumber();
        model.addAttribute("finalorders",orderFinList);
        return "order/storeordersucc";
    }
}
