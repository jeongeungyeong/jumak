package com.example.jumak.mapper.order;

import com.example.jumak.domain.dto.user.UserDto;
import com.example.jumak.domain.vo.order.OrderFinishVo;
import com.example.jumak.domain.vo.order.OrderVo;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;
import java.util.Optional;

@Mapper
public interface OrderMapper {
//   주문자 정보 조회(유저 넘버)
      Optional<OrderVo> selectByUNumber(Long userNumber);

//    주문 번호로 조회
   List<OrderFinishVo> selectByNumber ();
}
