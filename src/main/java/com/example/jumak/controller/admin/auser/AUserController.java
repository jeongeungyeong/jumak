package com.example.jumak.controller.admin.auser;


import com.example.jumak.domain.dto.user.UserDto;
import com.example.jumak.domain.vo.admin.Criteria;
import com.example.jumak.domain.vo.admin.PageVo;
import com.example.jumak.domain.vo.admin.SearchVo;
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
@RequestMapping("/user")
public class AUserController {
    private final AUserService aUserService;

    @GetMapping
    public String userList(Criteria criteria,Model model){
        List<UserDto> userList = aUserService.findAll(criteria);
        model.addAttribute("userList", userList);
        model.addAttribute("pageInfo", new PageVo(aUserService.findTotal(), criteria));
        return "admin/user/userList";
    }

    @GetMapping("/detail/{userNumber}")
    public String userDetail(@PathVariable("userNumber") Long boardNumber,
                             Model model){
        UserDto userDetail = aUserService.findOne(boardNumber);
        model.addAttribute("user", userDetail);
        return "admin/user/userDetail";

    }

//    @GetMapping("/search")
//    public String searchResult(SearchVo searchVo , Criteria criteria, Model model){
//        List<UserDto> searchDto = aUserService.findSearch(searchVo, criteria);
//
//        model.addAttribute("userList", searchDto);
//        model.addAttribute("pageInfo", new PageVo(aUserService.findTotal(), criteria));
//        return "admin/user/userList";
//    }

    @GetMapping("/search")
    public String searchResult(SearchVo searchVo, Model model){
        List<UserDto> searchDto = aUserService.findSearch(searchVo);

        model.addAttribute("userList", searchDto);
        return "admin/user/userList";
    }


}
