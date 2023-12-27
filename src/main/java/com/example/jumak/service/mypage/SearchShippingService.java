package com.example.jumak.service.mypage;

import com.example.jumak.domain.vo.myPage.OrderDetailVo;
import com.example.jumak.mapper.mypage.SearchShippingMapper;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
@RequiredArgsConstructor
@Transactional
public class SearchShippingService {
    private final SearchShippingMapper searchShippingMapper;


//    기간별 주문 배송내역 조회
    public List<OrderDetailVo> findOrderDetail(OrderDetailVo orderDetailVo) {
        List<OrderDetailVo> orderDetailList = searchShippingMapper.selectOrderDetail(orderDetailVo);

        return orderDetailList;
    }
}
