package com.example.jumak.mapper.admin.user;

import com.example.jumak.domain.dto.user.UserDto;
import com.example.jumak.domain.vo.admin.SearchVo;
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
    void insertSearch(){
        SearchVo searchVo = new SearchVo();
        searchVo.setSearchType("id");
        searchVo.setKeyword("asdf");
//        AUserMapper.selectSearch(searchVo);
    }

//    @Test
//    void insert(){
//        AUserMapper.insert(userDto);
//    }

//    @Test
//    void selectAll() {
//        AUserMapper.selectAll();
//    }
    @Test
    void delete(){
        AUserMapper.delete(174L);
    }
}