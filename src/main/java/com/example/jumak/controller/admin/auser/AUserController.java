package com.example.jumak.controller.admin.auser;


import com.example.jumak.domain.dto.user.UserDto;
import com.example.jumak.domain.vo.admin.ACriteria;
import com.example.jumak.domain.vo.admin.APageVo;
import com.example.jumak.domain.vo.admin.ASearchVo;
import com.example.jumak.service.admin.auser.AUserService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@Controller
@RequiredArgsConstructor
@RequestMapping("/admin/user")
public class AUserController {
    private final AUserService aUserService;

    @GetMapping()
    public String userList(ACriteria aCriteria, Model model){
        List<UserDto> userList = aUserService.findAll(aCriteria);
        model.addAttribute("userList", userList);
        model.addAttribute("pageInfo", new APageVo(aUserService.findTotal(), aCriteria));
        return "admin/user/userList";
    }

    @GetMapping("/detail/{userNumber}")
    public String userDetail(@PathVariable("userNumber") Long boardNumber,
                             Model model){
        UserDto userDetail = aUserService.findOne(boardNumber);
        model.addAttribute("user", userDetail);
        return "admin/user/userDetail";

    }



    @GetMapping("/search")
    public String searchResult(ASearchVo aSearchVo, ACriteria aCriteria, Model model){
        List<UserDto> searchDto = aUserService.findSearch(aSearchVo, aCriteria);

        model.addAttribute("userList", searchDto);
        model.addAttribute("searchVo", aSearchVo);
        model.addAttribute("pageInfo", new APageVo(aUserService.findSearchTotal(aSearchVo), aCriteria));
        return "admin/user/userListSearch";
    }




}
