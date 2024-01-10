package com.example.jumak.mapper.madang;

import com.example.jumak.domain.dto.madang.MadangRecommendDto;
import com.example.jumak.domain.dto.madang.MadangReplyDto;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface MadangRecommendMapper {
    //    특정 회원이 특정 게시물을 추천했는지 여부 검사
    int selectCount(MadangRecommendDto madangRecommendDto);

    //    추천 정보 삽입
    void insert(MadangRecommendDto madangRecommendDto);
}
