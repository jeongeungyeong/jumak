package com.example.jumak.service.order;

import com.example.jumak.domain.vo.order.OrderFinishVo;
import com.example.jumak.mapper.order.OrderMapper;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class OrderService {
    private final OrderMapper orderMapper;

//    주문요약정보
public List<OrderFinishVo> findByNumber(){
        return orderMapper.selectByNumber();
    }


}
