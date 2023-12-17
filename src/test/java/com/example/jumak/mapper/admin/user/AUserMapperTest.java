package com.example.jumak.mapper.admin.user;

import com.example.jumak.domain.dto.user.UserDto;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class AUserMapperTest {
    UserDto userDto;
    @Autowired
    com.example.jumak.mapper.admin.auser.AUserMapper AUserMapper;

    @BeforeEach
    void setUp() {
        userDto = new UserDto();
        userDto.setUserId("asdf");
        userDto.setUserPassword("1234");
        userDto.setUserAddress("asdf");
        userDto.setUserBirth("1232456");
        userDto.setUserEmail("asdf@gasdf");
        userDto.setUserName("ㅇㅇㅇ");
        userDto.setUserNickname("ddd");
        userDto.setUserAddressDetail("123e w34s");
        userDto.setUserCellphoneNumber("01012345678");
        userDto.setUserPhoneNumber("01012345678");
        userDto.setUserZipcode(12345L);
        userDto.setUserGradeNumber(2L);

    }


    @Test
    void insert(){
        AUserMapper.insert(userDto);
    }
    @Test
    void selectAll() {
        AUserMapper.selectAll();
    }
}