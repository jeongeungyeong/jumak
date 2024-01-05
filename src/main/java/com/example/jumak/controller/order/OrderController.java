package com.example.jumak.controller.order;

import com.example.jumak.domain.dto.order.OrderDto;
import com.example.jumak.domain.dto.product.ProductDto;
import com.example.jumak.domain.vo.order.OrderFinishVo;
import com.example.jumak.service.order.OrderService;
import com.example.jumak.service.product.ProductService;
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
    public String orderMain(Long productNumber,
                            @RequestParam("productCount") Long productCount,
                            Model model){
// productNumber 로 next페이지에 넘겨줄 정보 서비스에서 뽑아서 넘겨주고
//        productCount 는 그냥 넘겨주자
        ProductDto productDetail = productService.findByNumber(productNumber);


        model.addAttribute("productDetail",productDetail);
        model.addAttribute("productCount",productCount);
        // productCount는 @{productCount}이케만 html에 쓰면댐

        //이제 화면아래 자기정보뿌려야하잖아? 그거이제매퍼에서부터 찾아서

//여기다가 또 서비스연결해서 모델에뿌리면댐!!
        //완전 나이스...이거 나오는지 함만 볼게!
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
