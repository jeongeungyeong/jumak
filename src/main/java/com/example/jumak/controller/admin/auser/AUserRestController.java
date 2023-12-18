package com.example.jumak.controller.admin.auser;


import com.example.jumak.domain.dto.user.UserDto;
import com.example.jumak.service.admin.auser.AUserService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequiredArgsConstructor
@RequestMapping("/user")
public class AUserRestController {
    private final AUserService aUserService;

//    @DeleteMapping("/{userNumber}")
//    public void userRemove(@PathVariable("userNumber") Long userNumber) {
//        aUserService.remove(userNumber);
//    }


}
