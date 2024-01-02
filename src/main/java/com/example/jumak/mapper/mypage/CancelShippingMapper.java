package com.example.jumak.mapper.mypage;

import com.example.jumak.domain.vo.myPage.OrderDetailVo;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface CancelShippingMapper {
    //    기간별 주문 배송내역 조회
    List<OrderDetailVo> selectOrderDetail(OrderDetailVo orderDetailVo);
}
