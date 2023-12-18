package com.example.jumak.mapper.admin.user;

import com.example.jumak.domain.dto.user.UserDto;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class AAUserControllerMapperTest {
    UserDto userDto;
    @Autowired
    com.example.jumak.mapper.admin.auser.AUserMapper AUserMapper;

    @BeforeEach
    void setUp() {
        userDto = new UserDto();
        userDto.setUserId("ttttt");
        userDto.setUserPassword("1111");
        userDto.setUserAddress("서울시");
        userDto.setUserBirth("19870503");
        userDto.setUserEmail("tt@gmail.com");
        userDto.setUserName("강백호");
        userDto.setUserNickname("덩크왕");
        userDto.setUserAddressDetail("106동 1701호");
        userDto.setUserCellphoneNumber("01098765432");
        userDto.setUserPhoneNumber("01045678945");
        userDto.setUserZipcode(94805L);
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
    @Test
    void delete(){
        AUserMapper.delete(2L);
    }
}