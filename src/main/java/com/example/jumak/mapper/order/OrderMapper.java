package com.example.jumak.mapper.order;

import com.example.jumak.domain.vo.order.OrderFinishVo;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;
import java.util.Optional;

@Mapper
public interface OrderMapper {
//    주문 번호로 조회
   List<OrderFinishVo> selectByNumber ();
}
