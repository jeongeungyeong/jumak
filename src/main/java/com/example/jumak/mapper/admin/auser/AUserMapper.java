package com.example.jumak.mapper.admin.auser;

import com.example.jumak.domain.dto.user.UserDto;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface AUserMapper {
//    유저 전체 조회
    public List<UserDto> selectAll();
//    유저 가입 ㅡㅡ
    public void insert(UserDto userDto);
}
