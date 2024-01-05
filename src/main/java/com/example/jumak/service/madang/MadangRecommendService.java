package com.example.jumak.service.madang;

import com.example.jumak.domain.dto.madang.MadangRecommendDto;
import com.example.jumak.domain.dto.madang.MadangReplyDto;
import com.example.jumak.mapper.madang.MadangRecommendMapper;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@Transactional
@RequiredArgsConstructor
public class MadangRecommendService {
    private final MadangRecommendMapper madangRecommendMapper;


    //    추천 정보 삽입
    public void register(MadangRecommendDto madangRecommendDto){
        int count = madangRecommendMapper.selectCount(madangRecommendDto);

        if(count > 0){
            throw new IllegalStateException("이미 추천한 게시물입니다.");
        }

        madangRecommendMapper.insert(madangRecommendDto);
    }
}









