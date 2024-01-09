package com.example.jumak.service.order;

import com.example.jumak.domain.dto.user.UserDto;
import com.example.jumak.domain.vo.order.OrderFinishVo;
import com.example.jumak.domain.vo.order.OrderVo;
import com.example.jumak.mapper.order.OrderMapper;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class OrderService {
    private final OrderMapper orderMapper;

//    주문자 정보 조회
    public OrderVo findByUNumber(Long userNumber){
        return orderMapper.selectByUNumber(userNumber)
                .orElseThrow( ()->new IllegalStateException("주문자 정보 없음!"));
    }

//    주문요약정보
public List<OrderFinishVo> findByNumber(){
        return orderMapper.selectByNumber();
    }


}
