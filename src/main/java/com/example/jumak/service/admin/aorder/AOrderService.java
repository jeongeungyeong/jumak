package com.example.jumak.service.admin.aorder;

import com.example.jumak.domain.dto.order.OrderDto;
import com.example.jumak.domain.dto.user.UserDto;
import com.example.jumak.domain.vo.admin.ACriteria;
import com.example.jumak.domain.vo.admin.AOrderVo;
import com.example.jumak.domain.vo.admin.ASearchVo;
import com.example.jumak.mapper.admin.aorder.AOrderMapper;
import com.example.jumak.mapper.admin.auser.AUserMapper;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
@Transactional
@RequiredArgsConstructor
public class AOrderService {
    private final AOrderMapper aOrderMapper;


//        주문 전체 조회
    public List<AOrderVo> findAll(ACriteria aCriteria){
        return aOrderMapper.selectAll(aCriteria);
    }

//    public List<AOrderVo> findAll(){
//        return aOrderMapper.selectAll();
//    }



    //   주문 토탈
    public int findTotal(){
        return aOrderMapper.selectTotal();
    };

//    주문상태변경
    public void modifyOrderStatus(Long orderNumber, Long orderStatusNumber){
        aOrderMapper.updateOrderStatus(orderNumber,orderStatusNumber);
    }

}
