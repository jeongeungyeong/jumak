package com.example.jumak.mapper.mypage;

import com.example.jumak.domain.dto.user.UserDto;
import com.example.jumak.domain.vo.myPage.MemberVo;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface MemberMapper {
//    맴버정보조회
    UserDto selectMember(Long userNumber);

//    비번확인
    Long enterPassword(MemberVo memberVo);

//    맴버정보업데이트
   void updateMember(MemberVo memberVo);
}
