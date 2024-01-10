package com.example.jumak.mapper.admin.aqa;

import com.example.jumak.domain.dto.user.UserDto;
import com.example.jumak.domain.vo.admin.ACriteria;
import com.example.jumak.domain.vo.admin.AQaVo;
import com.example.jumak.domain.vo.admin.ASearchVo;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;
import java.util.Optional;

@Mapper
public interface AQaMapper {
//    리스트 조회
    public List<AQaVo> selectList(ACriteria aCriteria);

//    qa total
    public int selectTotal();

//    상세 조회
    public AQaVo selectOne(Long qaNumber);

//    답변 수정
    public void updateReply(@Param("qaReply") String qaReply,
                            @Param("qaNumber") Long qaNumber);
}
