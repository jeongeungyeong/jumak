package com.example.jumak.controller.admin.auser;


import com.example.jumak.domain.dto.user.UserDto;
import com.example.jumak.service.admin.auser.AUserService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@Controller
@RequiredArgsConstructor
@RequestMapping("/user")
public class AUserController {
    private final AUserService aUserService;

    @GetMapping
    public String boardList(Model model){
        List<UserDto> userList = aUserService.finalAll();
        model.addAttribute("userList", userList);
        return "admin/user/userList";
    }


}
