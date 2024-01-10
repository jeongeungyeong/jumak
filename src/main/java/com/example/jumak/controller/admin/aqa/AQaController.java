package com.example.jumak.controller.admin.aqa;


import com.example.jumak.domain.vo.admin.ACriteria;
import com.example.jumak.domain.vo.admin.APageVo;
import com.example.jumak.domain.vo.admin.AQaVo;
import com.example.jumak.service.admin.aqa.AQaService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.view.RedirectView;

import java.util.List;

@Controller
@RequiredArgsConstructor
@RequestMapping("/admin/qa")
public class AQaController {
    private final AQaService aQaService;

//    리스트 조회
    @GetMapping
    public String qaList(ACriteria aCriteria,Model model){
        List<AQaVo> list = aQaService.findList(aCriteria);
        model.addAttribute("qaList", list);
        model.addAttribute("pageInfo", new APageVo(aQaService.findTotal(),aCriteria));
        return "admin/qa/adminQa";
    }

//    상세
    @GetMapping("/detail/{qaNumber}")
    public String qaDetail(@PathVariable("qaNumber") Long qaNumber,
                           Model model){
        AQaVo qaDetail = aQaService.findOne(qaNumber);
        model.addAttribute("qaDetail",qaDetail);
        return "admin/qa/adminQaDetail";
    }

//    답변등록 또는 수정
    @GetMapping("/reply/{qaNumber}")
    public String qaReply(@PathVariable("qaNumber") Long qaNumber,
                          Model model){
        AQaVo qaDetail = aQaService.findOne(qaNumber);
        model.addAttribute("qaDetail",qaDetail);
        return "admin/qa/adminQaReply";
    }

    @PostMapping("/reply")
    public RedirectView qaReply(@RequestParam("qaNumber") Long qaNumber,
                                @RequestParam("qaReply") String qaReply){
        aQaService.modifyReply(qaReply,qaNumber);
        return new RedirectView("/admin/qa/detail/"+qaNumber);
    }
}
