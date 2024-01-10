package com.example.jumak.mapper.madang;

import com.example.jumak.domain.dto.madang.MadangDto;
import com.example.jumak.domain.dto.madang.MadangReplyDto;
import com.example.jumak.domain.dto.user.UserDto;
import com.example.jumak.domain.vo.madang.MadangReplyCountVo;
import com.example.jumak.domain.vo.madang.MadangReplyVo;
import com.example.jumak.mapper.user.UserMapper;
import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest
@Transactional
class MadangReplyMapperTest {
    @Autowired
    MadangReplyMapper madangReplyMapper;
    @Autowired
    UserMapper userMapper;
    @Autowired
    MadangMapper madangMapper;

    MadangReplyDto madangReplyDto;
    UserDto userDto;
    MadangDto madangDto;

    @BeforeEach
    void setUp() {
        userDto = new UserDto();
        userDto.setUserId("test");
        userDto.setUserPassword("1234");
        userDto.setUserAddress("test");
        userDto.setUserBirth("20000101");
        userDto.setUserEmail("test@naver.com");
        userDto.setUserAddressDetail("testest");
        userDto.setUserCellphoneNumber("01011111111");
        userDto.setUserGradeNumber(1L);
        userDto.setUserName("홍길동");
        userDto.setUserNickname("test");
        userDto.setUserPhoneNumber("12341234");
        userDto.setUserZipcode(12345L);
        userMapper.insert(userDto);

        madangDto =new MadangDto();
        madangDto.setMadangTitle("test");
        madangDto.setMadangContent("test");
        madangDto.setUserNumber(userDto.getUserNumber());
        madangDto.setMadangCategoryNumber(1L);
        madangMapper.insert(madangDto);


        madangReplyDto = new MadangReplyDto();
        madangReplyDto.setMadangReplyContent("ㅎㅇ");
        madangReplyDto.setMadangNumber(madangDto.getMadangNumber());
        madangReplyDto.setUserNumber(userDto.getUserNumber());
    }

    @Test
    void selectReplyRecommendCount() {
        MadangReplyCountVo madangReplyCountVo = madangReplyMapper.selectReplyRecommendCount(21L).get();
        System.out.println("madangReplyCountVo = " + madangReplyCountVo);
    }

    @Test
    void selectListByMadangNumber() {
        List<MadangReplyVo> replyList = madangReplyMapper.selectListByMadangNumber(21L);
        System.out.println("replyList = " + replyList);
    }

    @Test
    void insert() {
        madangReplyMapper.insert(madangReplyDto);

        List<MadangReplyVo> replyList = madangReplyMapper.selectListByMadangNumber(madangDto.getMadangNumber());

        replyList.forEach(System.out::println);
        assertThat(replyList).size().isEqualTo(1);
    }

    @Test
    void update(){
        madangReplyMapper.insert(madangReplyDto);
        madangReplyMapper.update(madangReplyDto.getMadangReplyNumber(), "update");

        List<MadangReplyVo> replyList = madangReplyMapper.selectListByMadangNumber(madangDto.getMadangNumber());

        assertThat(replyList).extracting(MadangReplyVo::getMadangReplyContent)
                .contains("update");
    }
}