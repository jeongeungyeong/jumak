package com.example.jumak.mapper.admin.auser;

import com.example.jumak.domain.dto.user.UserDto;
import com.example.jumak.domain.vo.admin.Criteria;
import com.example.jumak.domain.vo.admin.SearchVo;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;
import java.util.Optional;

@Mapper
public interface AUserMapper {
//    유저 전체 조회
    public List<UserDto> selectAll(Criteria criteria);
//    유저 번호로 상세정보 조회
    public Optional<UserDto> selectOne(Long userNumber);
//    유저 삭제
    public void delete(Long userNumber);

    public void insert(UserDto userDto);
//    USER TOTAL
    public int selectTotal();
//
//    //    검색어 조회
//    public List<UserDto> selectSearch(@Param("searchVo")SearchVo searchVo, Criteria criteria);

//    검색어 조회
    public List<UserDto> selectSearch(SearchVo searchVo);
}
