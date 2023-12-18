package com.example.jumak.mapper.mypage;

import com.example.jumak.domain.dto.madang.MadangDto;
import com.example.jumak.domain.dto.user.UserDto;
import org.apache.ibatis.annotations.Mapper;

import java.util.Optional;

@Mapper
public interface MypageMapper {
    //회원 이름 조회
    String selectName(Long userNumber);

//    작성글 개수 조회
    Long selectBoardCount(Long userNumber);

    void insert(UserDto userDto);
}
