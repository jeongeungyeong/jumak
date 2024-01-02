package com.example.jumak.service.admin.aorder;

import com.example.jumak.domain.dto.order.OrderDto;
import com.example.jumak.domain.dto.user.UserDto;
import com.example.jumak.domain.vo.admin.ACriteria;
import com.example.jumak.domain.vo.admin.AOrderDetailVo;
import com.example.jumak.domain.vo.admin.AOrderVo;
import com.example.jumak.domain.vo.admin.ASearchVo;
import com.example.jumak.mapper.admin.aorder.AOrderMapper;
import com.example.jumak.mapper.admin.auser.AUserMapper;
import lombok.RequiredArgsConstructor;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
@Transactional
@RequiredArgsConstructor
public class AOrderService {
    private final AOrderMapper aOrderMapper;


    //   주문 전체 조회
    public List<AOrderVo> findAll(ACriteria aCriteria){
        return aOrderMapper.selectAll(aCriteria);
    }

    //   주문 토탈
    public int findTotal(){
        return aOrderMapper.selectTotal();
    };

    //   주문상태변경
    public void modifyOrderStatus(Long orderNumber, Long orderStatusNumber){
        aOrderMapper.updateOrderStatus(orderNumber,orderStatusNumber);
    }

    //    주문 단건 조회
    public AOrderVo selectOrderOne(Long orderNumber){
        return aOrderMapper.selectOrderOne(orderNumber);
    }

    //    주문 상세 조회(주문번호)
    public List<AOrderDetailVo> selectOrderDetail(Long orderNumber){
        return aOrderMapper.selectOrderDetail(orderNumber);
    }

    //    주문 검색 조회
    public List<AOrderVo> selectSearch(@Param("searchVo") ASearchVo aSearchVo, @Param("criteria") ACriteria aCriteria){
        return aOrderMapper.selectSearch(aSearchVo,aCriteria);
    }

    //    주문 검색 토탈
    public int selectSearchTotal(ASearchVo aSearchVo){
        return aOrderMapper.selectSearchTotal(aSearchVo);
    }

}
