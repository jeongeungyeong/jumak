package com.example.jumak.mapper.admin.auser;

import com.example.jumak.domain.dto.user.UserDto;
import com.example.jumak.domain.vo.admin.ACriteria;
import com.example.jumak.domain.vo.admin.ASearchVo;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;
import java.util.Optional;

@Mapper
public interface AUserMapper {
    //    유저 전체 조회
    public List<UserDto> selectAll(ACriteria aCriteria);

    //    USER TOTAL
    public int selectTotal();

    //    유저 번호로 상세정보 조회
    public Optional<UserDto> selectOne(Long userNumber);
    //    유저 삭제
    public void delete(Long userNumber);

//    public void insert(UserDto userDto);



    //    검색어로 조회
    public List<UserDto> selectSearch(@Param("searchVo") ASearchVo aSearchVo, @Param("criteria") ACriteria aCriteria);

    //     Search Total
    public int selectSearchTotal(ASearchVo aSearchVo);
}
