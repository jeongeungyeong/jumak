package com.example.jumak.service.admin.auser;

import com.example.jumak.domain.dto.user.UserDto;
import com.example.jumak.domain.vo.admin.ACriteria;
import com.example.jumak.domain.vo.admin.ASearchVo;
import com.example.jumak.mapper.admin.auser.AUserMapper;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
@Transactional
@RequiredArgsConstructor
public class AUserService {
    private final AUserMapper AUserMapper;


    //    유저 전체 조회
    public List<UserDto> findAll(ACriteria aCriteria){
        return AUserMapper.selectAll(aCriteria);
    }

    //    유저 번호로 상세정보 조회
    public UserDto findOne(Long userNumber){
        return AUserMapper.selectOne(userNumber).orElseThrow(()->
                new IllegalStateException("존재하지 않는 user 정보"));
    }
    //    유저 삭제
    public void remove(Long userNumber){
        AUserMapper.delete(userNumber);
    }

    //    유저 전체 수 조회 / USER TOTAL
    public int findTotal(){
        return AUserMapper.selectTotal();
    };

    //   검색어 조회
    public List<UserDto> findSearch(ASearchVo aSearchVo, ACriteria aCriteria) {
        return AUserMapper.selectSearch(aSearchVo, aCriteria);
    }

    //     Search total
    public int findSearchTotal(ASearchVo aSearchVo) {
        return AUserMapper.selectSearchTotal(aSearchVo);

    }
}
