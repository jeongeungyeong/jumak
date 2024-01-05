package com.example.jumak.mapper.mypage;

import com.example.jumak.domain.dto.qa.QaDto;
import com.example.jumak.domain.dto.user.UserDto;
import com.example.jumak.service.mypage.InquiryService;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.transaction.annotation.Transactional;

import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest
@Transactional
class InquiryMapperTest {
    @Autowired InquiryService inquiryService;

    UserDto userDto;
    QaDto qaDto;

    @BeforeEach
    void setUp() {
        userDto = new UserDto();
        userDto.setUserNumber(1L);
        userDto.setUserId("test1");
        userDto.setUserPassword("1234");
        userDto.setUserAddress("노원구");
        userDto.setUserAddressDetail("1234");
        userDto.setUserBirth("1234");
        userDto.setUserEmail("1234@naver.com");
        userDto.setUserCellphoneNumber("1234");
        userDto.setUserGradeNumber(1L);
        userDto.setUserName("홍길동");
        userDto.setUserNickname("쾌도");
        userDto.setUserPhoneNumber("1234");
        userDto.setUserZipcode(1234L);

        qaDto = new QaDto();
        qaDto.setQaTitle("test ing~");
        qaDto.setQaContent("test진행중~");
        qaDto.setQaDate("2024-01-03");
        qaDto.setQaCategoryNumber(1L);
        qaDto.setUserNumber(1L);
    }

    @Test
    void insertInquiry() {
        inquiryService.register(qaDto);
    }
}