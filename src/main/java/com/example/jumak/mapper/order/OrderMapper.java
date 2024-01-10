package com.example.jumak.mapper.order;

import com.example.jumak.domain.dto.delivery.DeliveryAddressDto;
import com.example.jumak.domain.dto.order.PaymentDto;
import com.example.jumak.domain.dto.user.UserDto;
import com.example.jumak.domain.vo.order.OrderFinishVo;
import com.example.jumak.domain.vo.order.OrderVo;
import com.example.jumak.domain.vo.order.PaymentVo;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;
import java.util.Optional;

@Mapper
public interface OrderMapper {
//   주문자 정보 조회(유저 넘버)
      Optional<OrderVo> selectByUNumber(Long userNumber);

//    주문 번호로 조회
   List<OrderFinishVo> selectByNumber ();

//   배송지 정보 삽입
    void deliveryInsert(PaymentVo paymentVo);
//    결제 정보 삽입
    void paymentInsert(PaymentVo paymentVo);
}
