package com.example.jumak.service.madang;

import com.example.jumak.domain.dto.madang.MadangReplyDto;
import com.example.jumak.domain.vo.madang.MadangReplyCountVo;
import com.example.jumak.domain.vo.madang.MadangReplyVo;
import com.example.jumak.mapper.madang.MadangReplyMapper;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class MadangReplyService {
    private final MadangReplyMapper madangReplyMapper;

    public MadangReplyCountVo findReplyRecommendCount(Long madangNumber) {
        return madangReplyMapper.selectReplyRecommendCount(madangNumber)
                .orElseThrow(() -> new IllegalStateException("존재하지 않는 게시물"));
    }

    //    리플 리스트 조회
    public List<MadangReplyVo> findListByMadangNumber(Long madangNumber){
        return madangReplyMapper.selectListByMadangNumber(madangNumber);
    }

    //    리플 작성
    public void register(MadangReplyDto madangReplyDto){
        madangReplyMapper.insert(madangReplyDto);
    }

    //    리플 수정
    public void modify(Long madangReplyNumber, String madangReplyContent){
        madangReplyMapper.update(madangReplyNumber, madangReplyContent);
    }

    //    리플 삭제
    public void remove(Long madangReplyNumber){
        madangReplyMapper.delete(madangReplyNumber);
    }
}
