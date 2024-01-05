package com.example.jumak.mapper.mypage;

import com.example.jumak.domain.dto.user.UserDto;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface MemberMapper {
//    맴버정보조회
    UserDto selectMember(Long userNumber);
}
