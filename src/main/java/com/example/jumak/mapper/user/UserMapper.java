package com.example.jumak.mapper.user;

import com.example.jumak.domain.dto.user.UserDto;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;
import java.util.Optional;

@Mapper
public interface UserMapper {
// 회원 아이디,패스워드로 번호 조회
    Optional<Long> selectUserNumber(String userId, String userPassword);

//    로그인 정보 조회
    Optional<UserDto> selectLoginInfo(@Param("userId") String userId, @Param("userPassword") String userPassword);

// 이름으로 회원 조회
    UserDto selectByName(String userName);

// 전체 회원 조회
    List<UserDto> selectAll();

// 회원 등록
    void insert(UserDto userDto);

// 회원 삭제
    void delete(Long userNumber);
}
