package com.example.jumak.service.mypage;

import com.example.jumak.domain.vo.myPage.OrderDetailVo;
import com.example.jumak.mapper.mypage.CancelShippingMapper;
import com.example.jumak.mapper.mypage.RefundShippingMapper;
import com.example.jumak.mapper.mypage.SearchShippingMapper;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
@RequiredArgsConstructor
@Transactional
public class ShippingService {
    private final SearchShippingMapper searchShippingMapper;
    private final CancelShippingMapper cancelShippingMapper;
    private final RefundShippingMapper refundShippingMapper;


//    기간별 주문 배송내역 조회
    public List<OrderDetailVo> findSearchDetail(OrderDetailVo orderDetailVo) {
        List<OrderDetailVo> orderDetailList = searchShippingMapper.selectOrderDetail(orderDetailVo);

        return orderDetailList;
    }

//    기간별 취소/반품/교환 배송내역 조회
    public List<OrderDetailVo> findCancelDetail(OrderDetailVo orderDetailVo) {
        List<OrderDetailVo> orderDetailList = cancelShippingMapper.selectOrderDetail(orderDetailVo);

        return orderDetailList;
    }

//    기간별 환불/입금 내역 조회
    public List<OrderDetailVo> findRefundDetail(OrderDetailVo orderDetailVo) {
        List<OrderDetailVo> orderDetailList = refundShippingMapper.selectOrderDetail(orderDetailVo);

        return orderDetailList;
    }
}
