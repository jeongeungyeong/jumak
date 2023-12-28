package com.example.jumak.mapper.admin.aorder;

import com.example.jumak.domain.dto.order.OrderDto;
import com.example.jumak.domain.dto.user.UserDto;
import com.example.jumak.domain.vo.admin.ACriteria;
import com.example.jumak.domain.vo.admin.AOrderVo;
import com.example.jumak.domain.vo.admin.ASearchVo;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;
import java.util.Optional;

@Mapper
public interface AOrderMapper {
//    주문 전체 조회
    public List<AOrderVo> selectAll(ACriteria aCriteria);

//    주문 토탈
    public int selectTotal();
}
