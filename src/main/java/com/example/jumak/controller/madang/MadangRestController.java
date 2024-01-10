package com.example.jumak.controller.madang;

import com.example.jumak.domain.dto.madang.MadangRecommendDto;
import com.example.jumak.mapper.madang.MadangRecommendMapper;
import com.example.jumak.service.madang.MadangRecommendService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.sql.SQLException;

@RestController
@RequestMapping("/madangs")
@RequiredArgsConstructor
public class MadangRestController {
    private final MadangRecommendService recommendService;

    @PostMapping("/recommend/{madangNumber}")
    public ResponseEntity<String> madangRecommend(@PathVariable("madangNumber") Long madangNumber,
                                                  @SessionAttribute(value = "userNumber", required = false) Long userNumber){
        MadangRecommendDto madangRecommendDto = new MadangRecommendDto();
        madangRecommendDto.setMadangNumber(madangNumber);
        madangRecommendDto.setUserNumber(userNumber);

        if(userNumber == null){
            return ResponseEntity
                    .status(HttpStatus.UNAUTHORIZED)
                    .body("로그인이 필요한 서비스입니다.");
        }

        try {
            recommendService.register(madangRecommendDto);
            return ResponseEntity.ok("추천 완료");
        } catch (IllegalStateException e) {
            return ResponseEntity
                    .status(HttpStatus.BAD_REQUEST)
                    .body(e.getMessage());
        }
    }
}











