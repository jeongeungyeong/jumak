package com.example.jumak.controller.madang;

import com.example.jumak.domain.dto.madang.MadangReplyDto;
import com.example.jumak.domain.vo.madang.MadangReplyCountVo;
import com.example.jumak.domain.vo.madang.MadangReplyVo;
import com.example.jumak.service.madang.MadangReplyService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/replies")
@RequiredArgsConstructor
public class MadangReplyRestController {
    private final MadangReplyService replyService;

    @GetMapping("/count")
    public MadangReplyCountVo count(Long madangNumber){
        return replyService.findReplyRecommendCount(madangNumber);
    }

    @GetMapping("/list/{madangNumber}")
    public List<MadangReplyVo> replyList(@PathVariable("madangNumber") Long madangNumber) {
        return replyService.findListByMadangNumber(madangNumber);
    }
    
    @PostMapping
    public void replyWrite(@RequestBody MadangReplyDto madangReplyDto,
                           @SessionAttribute("userNumber") Long userNumber){
        madangReplyDto.setUserNumber(userNumber);
        replyService.register(madangReplyDto);
    }

    @PatchMapping("/{madangReplyNumber}")
    public void replyModify(@PathVariable("madangReplyNumber") Long madangReplyNumber,
                            @RequestBody MadangReplyDto madangReplyDto){
        replyService.modify(madangReplyNumber, madangReplyDto.getMadangReplyContent());
    }

    @DeleteMapping("/{madangReplyNumber}")
    public void replyRemove(@PathVariable("madangReplyNumber") Long madangReplyNumber){
        replyService.remove(madangReplyNumber);
    }
}
