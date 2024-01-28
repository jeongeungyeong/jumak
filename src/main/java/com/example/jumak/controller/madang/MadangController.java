package com.example.jumak.controller.madang;

import com.example.jumak.domain.dto.madang.MadangCategoryDto;
import com.example.jumak.domain.dto.madang.MadangDto;
import com.example.jumak.domain.dto.user.UserDto;
import com.example.jumak.domain.vo.madang.MadangDetailVo;
import com.example.jumak.domain.vo.madang.MadangVo;
import com.example.jumak.domain.vo.product.Criteria;
import com.example.jumak.domain.vo.product.PageVo;
import com.example.jumak.service.madang.MadangService;
import com.example.jumak.service.user.UserService;
import jakarta.servlet.http.HttpServletRequest;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.view.RedirectView;

import java.util.List;

@Controller
@RequestMapping("/madang")
@RequiredArgsConstructor
public class MadangController {
    private final UserService userService;
    private final MadangService madangService;

    //    임시 이동 처리
    @GetMapping("/list")
    public String madangList(@RequestParam(value = "cateNumber", required = false) Long cateNumber,
                             Criteria criteria,
                             Model model) {
        criteria.setAmount(15);
        List<MadangVo> madangList = madangService.findListByCate(cateNumber, criteria);
        int total = madangService.findTotal(cateNumber);
        PageVo pageInfo = new PageVo(total, criteria);

        model.addAttribute("madangList", madangList);
        model.addAttribute("pageInfo", pageInfo);


        model.addAttribute("cateNumber",cateNumber);

        return "madang/madang-list";
    }

    //    임시 이동 처리
    @GetMapping("/detail")
    public String madangDetail(Long madangNumber, Model model) {
        MadangDetailVo madang = madangService.findDetail(madangNumber);
        model.addAttribute("madang", madang);

        return "madang/madang-detail";
    }

    @GetMapping("/write")
    public String madangWrite(HttpServletRequest req, Model model) {
        Long userNumber = (Long) req.getSession().getAttribute("userNumber");
        if (userNumber == null) {
            return "user/login/login";
        }



        List<MadangCategoryDto> allCategory = madangService.findAllCategory();
        model.addAttribute("cateList", allCategory);

        return "madang/madang-write";
    }

    @PostMapping("/write")
    public RedirectView madangWrite(MadangDto madangDto,
                                    @SessionAttribute("userNumber") Long userNumber) {
        madangDto.setUserNumber(userNumber);
        madangService.register(madangDto);

        return new RedirectView("/madang/list");
    }
}












