package com.example.jumak.service.user;

import com.example.jumak.domain.dto.user.UserDto;
import com.example.jumak.mapper.user.UserMapper;
import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.jupiter.MockitoExtension;

import java.util.ArrayList;
import java.util.List;

import static org.assertj.core.api.Assertions.assertThat;
import static org.assertj.core.api.Assertions.assertThatThrownBy;
import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.ArgumentMatchers.any;
import static org.mockito.Mockito.*;

@ExtendWith(MockitoExtension.class)
class UserServiceTest {
    @Mock
    UserMapper userMapper;
    @InjectMocks
    UserService userService;

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

    @Test
    void findUserNumber() {
    }

    @Test
    void findByName() {
        doReturn(userDto).when(userMapper).selectByName(any());

        UserDto foundUser = userService.findByName("ㅇㅇ");

        assertThat(foundUser.getUserName()).isEqualTo(userDto.getUserName());
    }

    @Test
    void findByNameException(){
        doReturn(null).when(userMapper).selectByName(any());

//        UserDto foundUser = userService.findByName("ㅇㅇ");

        assertThatThrownBy(()-> userService.findByName("ㅇㅇ"))
                .isInstanceOf(IllegalStateException.class)
                .hasMessageContaining("존재하지");
    }

    @Test
    void findAll() {
        List<UserDto> list = new ArrayList<>();
        list.add(userDto);

        doReturn(list).when(userMapper).selectAll();

        List<UserDto> userList = userService.findAll();

        assertThat(userList.size()).isEqualTo(1);
    }

    @Test
    void register() {
        doNothing().when(userMapper).insert(any());

        userService.register(userDto);

        verify(userMapper, times(1)).insert(any());
    }

    @Test
    void remove() {
        doNothing().when(userMapper).delete(any());

        userService.remove(1L);

        verify(userMapper, times(1)).delete(any());
    }
}