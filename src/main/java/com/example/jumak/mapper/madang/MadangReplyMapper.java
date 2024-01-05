package com.example.jumak.mapper.madang;

import com.example.jumak.domain.dto.madang.MadangReplyDto;
import com.example.jumak.domain.vo.madang.MadangReplyCountVo;
import com.example.jumak.domain.vo.madang.MadangReplyVo;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;
import java.util.Optional;

@Mapper
public interface MadangReplyMapper {
    Optional<MadangReplyCountVo> selectReplyRecommendCount(Long madangNumber);

//    리플 리스트 조회
    List<MadangReplyVo> selectListByMadangNumber(Long madangNumber);

//    리플 작성
    void insert(MadangReplyDto madangReplyDto);

    //    리플 수정
    void update(@Param("madangReplyNumber") Long madangReplyNumber,
                @Param("madangReplyContent") String madangReplyContent);


    //    리플 삭제
    void delete(Long madangReplyNumber);
}
