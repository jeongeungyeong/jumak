package com.example.jumak.service.order;

import com.example.jumak.domain.vo.order.OrderFinishVo;
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

import static org.mockito.Mockito.doReturn;

@ExtendWith(MockitoExtension.class)
class OrderServiceTest {
    @Mock
    OrderMapper orderMapper;
    @InjectMocks
    OrderService orderService;

    OrderFinishVo orderFinishVo;

    @BeforeEach
    void setUp() {
        orderFinishVo = new OrderFinishVo();
    }

    @Test
    void findByNumber() {
        //given
        doReturn(List.of(orderFinishVo)).when(orderMapper).selectByNumber();
        //when
        List<OrderFinishVo> orderNumberList = orderService.findByNumber();
        //then
        Assertions.assertThat(orderNumberList).contains(orderFinishVo);
    }
}