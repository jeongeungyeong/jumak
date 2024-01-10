package com.example.jumak.service.user;

import com.example.jumak.domain.dto.user.UserDto;
import com.example.jumak.mapper.user.UserMapper;
import lombok.RequiredArgsConstructor;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
@RequiredArgsConstructor
public class UserService {
    private final UserMapper userMapper;

    // 회원 아이디,패스워드로 번호 조회
    public Long findUserNumber(String userId, String userPassword){
     return userMapper.selectUserNumber(userId, userPassword)
             .orElseThrow(()-> new IllegalStateException("존재하지 않는 회원 정보"));
    }

//    로그인 정보 조회
    public UserDto findLoginInfo(String userId, String userPassword){
        return userMapper.selectLoginInfo(userId, userPassword)
                .orElseThrow(()-> new IllegalStateException("존재하지 않는 회원 정보"));
    }

    // 이름으로 회원 조회
    public UserDto findByName(String userName){
        return Optional.ofNullable(userMapper.selectByName(userName))
                .orElseThrow(()-> new IllegalStateException("존재하지 않는 회원 이름"));
    }

    // 전체 회원 조회
    public List<UserDto> findAll(){
        return userMapper.selectAll();
    }

    // 회원 등록
    public void register(UserDto userDto){
        userMapper.insert(userDto);
    }

    // 회원 삭제
    public void remove(Long userNumber){
        userMapper.delete(userNumber);
    }
}
