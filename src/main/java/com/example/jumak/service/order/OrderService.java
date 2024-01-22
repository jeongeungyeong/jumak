package com.example.jumak.service.order;

import com.example.jumak.domain.dto.delivery.DeliveryAddressDto;
import com.example.jumak.domain.dto.order.PaymentDto;
import com.example.jumak.domain.dto.order.ShoppingListDto;
import com.example.jumak.domain.dto.user.UserDto;
import com.example.jumak.domain.vo.order.*;
import com.example.jumak.mapper.order.OrderMapper;
import lombok.RequiredArgsConstructor;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
@Transactional
@RequiredArgsConstructor
public class OrderService {
    private final OrderMapper orderMapper;

//    쇼핑 카트 저장
    public List<CartVo> cartRegister(ShoppingListDto shoppingListDto){
        orderMapper.cartDelete(shoppingListDto);
        orderMapper.cartInsert(shoppingListDto);

        List<CartVo> cartList = orderMapper.cartListSelect(shoppingListDto.getUserNumber());
        return cartList;
    }


//    주문자 정보 삽입
    public void orderRegister(OrderVo orderVo){
        orderMapper.orderInsert(orderVo);
    }
//    주문 상세 정보 삽입

    public void orderDetailRegister(OrderDetailPayVo orderDetailPayVo){
        orderMapper.orderDetailInsert(orderDetailPayVo);

    }
    //     결제정보 삽입
    public void paymentRegister(OrderVo orderVo){
        orderMapper.paymentInsert(orderVo);
    }

    public void paymentProcess(OrderVo orderVo){
        orderMapper.orderInsert(orderVo);
        orderMapper.paymentInsert(orderVo);

        OrderDetailPayVo orderDetailPayVo = new OrderDetailPayVo();
        orderDetailPayVo.setOrderDetailCount(orderVo.getOrderDetailCount());
        orderDetailPayVo.setOrderNumber(orderVo.getOrderNumber());
        orderDetailPayVo.setProductNumber(orderVo.getProductNumber());

        orderMapper.orderDetailInsert(orderDetailPayVo);
    }



    //    주문자 정보 조회
    public OrderVo findByUNumber(Long userNumber){
        return orderMapper.selectByUNumber(userNumber)
                .orElseThrow( ()->new IllegalStateException("주문자 정보 없음!"));
    }

    //    주문 정보 디테일
/*    public void orderDetailRegister(List<OrderDetailPayVo> orderDetailPayVo){

//        빠른 for문
*//*        for (OrderDetailPayVo detailVo : orderDetailPayVo) {
            orderMapper.orderDetailInsert(detailVo);
        }*//*

    }*/



//    주문요약정보
public OrderVo findByNumber(Long userNumber){
        return orderMapper.selectByNumber(userNumber)
                .orElseThrow(() -> new IllegalStateException("주문 정보 없음"));
    }




}
