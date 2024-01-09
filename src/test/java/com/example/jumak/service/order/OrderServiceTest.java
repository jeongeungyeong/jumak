package com.example.jumak.service.order;

import com.example.jumak.domain.dto.user.UserDto;
import com.example.jumak.domain.vo.order.OrderFinishVo;
import com.example.jumak.domain.vo.order.OrderVo;
import com.example.jumak.mapper.order.OrderMapper;
import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.jupiter.MockitoExtension;

import java.util.List;
import java.util.Optional;

import static org.assertj.core.api.Assertions.assertThat;
import static org.mockito.ArgumentMatchers.any;
import static org.mockito.Mockito.doReturn;

@ExtendWith(MockitoExtension.class)
class OrderServiceTest {
    @Mock
    OrderMapper orderMapper;
    @InjectMocks
    OrderService orderService;

    OrderFinishVo orderFinishVo;
    UserDto userDto;

    @BeforeEach
    void setUp() {
        orderFinishVo = new OrderFinishVo();
        userDto = new UserDto();
    }

    @Test
    void findByNumber() {
        //given
        doReturn(List.of(orderFinishVo)).when(orderMapper).selectByNumber();
        //when
        List<OrderFinishVo> orderNumberList = orderService.findByNumber();
        //then
        assertThat(orderNumberList).contains(orderFinishVo);
    }

    @Test
    void findByUNumber() {
        // given
            doReturn(Optional.ofNullable(userDto)).when(orderMapper).selectByUNumber(any());
        // when
        OrderVo byUNumber = orderService.findByUNumber(21L);
        // then
        assertThat(byUNumber).isEqualTo(userDto);
    }
}