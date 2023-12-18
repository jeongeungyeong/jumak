package com.example.jumak.mapper.mypage;

import com.example.jumak.domain.dto.user.UserDto;
import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.transaction.annotation.Transactional;

import static org.assertj.core.api.Assertions.assertThat;

@SpringBootTest
@Transactional
class MypageMapperTest {
    @Autowired
    MypageMapper mypageMapper;

    UserDto userDto;

    @BeforeEach
    void setUp() {
        userDto = new UserDto();
        userDto.setUserId("aaa");
        userDto.setUserPassword("1234");
        userDto.setUserName("홍길동");
        userDto.setUserNickname("Mr.홍");
        userDto.setUserEmail("aaa@naver.com");
        userDto.setUserCellphoneNumber("01012345678");
        userDto.setUserPhoneNumber("0318111234");
        userDto.setUserAddress("의정부시");
        userDto.setUserAddressDetail("101호");
        userDto.setUserZipcode(123123L);
        userDto.setUserBirth("19980522");
        userDto.setUserGradeNumber(1L);

    }

    @Test
    void selectName() {
//        given
        mypageMapper.insert(userDto);
//        when
        String foundName = mypageMapper.selectName(userDto.getUserNumber());
//        then
        assertThat(foundName).isEqualTo(userDto.getUserName());
//        assertThat(foundName.get()).isEqualTo(userDto.getUserNumber());
    }
}