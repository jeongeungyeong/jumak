package com.example.jumak.mapper.user;

import com.example.jumak.domain.dto.user.UserDto;
import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.*;
@SpringBootTest
@Transactional
class UserMapperTest {
    @Autowired
    UserMapper userMapper;
    UserDto userDto;

    @BeforeEach
    void setUp() {
        userDto = new UserDto();
        userDto.setUserId("aaa");
        userDto.setUserPassword("1234");
        userDto.setUserName("홍길동");
        userDto.setUserNickname("나야나");
        userDto.setUserEmail("aaa@naver.com");
        userDto.setUserBirth("2000년1월1일");
        userDto.setUserCellphoneNumber("01012345678");
        userDto.setUserPhoneNumber("021234567");
        userDto.setUserAddress("노원구");
        userDto.setUserAddressDetail("상계로1길");
        userDto.setUserZipcode("1234");
    }

    @Test @DisplayName("회원 저장 및 조회 테스트")
    void insertAndSelect(){
        userMapper.insert(userDto);

        UserDto foundUser = userMapper.selectByName(this.userDto.getUserName());

        assertThat(foundUser.getUserName()).isEqualTo(userDto.getUserName());
    }

    @Test @DisplayName("회원번호 조회")
    void selectUserNumber() {
        userMapper.insert(userDto);

        Long foundNumber = userMapper.selectUserNumber(userDto.getUserId(), userDto.getUserPassword());

        assertThat(foundNumber).isEqualTo(userDto.getUserNumber());
    }

    @Test @DisplayName("회원 전체 목록 조회")
    void selectAll() {
        userMapper.insert(userDto);

        List<UserDto> userList = userMapper.selectAll();

        assertThat(userList.size()).isEqualTo(1);
    }

    @Test @DisplayName("회원 삭제")
    void delete() {
        userMapper.insert(userDto);
        UserDto foundUser = userMapper.selectByName(this.userDto.getUserName());

        userMapper.delete(foundUser.getUserNumber());

        assertThat(userMapper.selectAll().isEmpty());
    }
}