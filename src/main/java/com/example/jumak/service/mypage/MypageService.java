package com.example.jumak.service.mypage;

import com.example.jumak.domain.dto.user.UserDto;
import com.example.jumak.mapper.mypage.MypageMapper;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@RequiredArgsConstructor
@Transactional
public class MypageService {
    private final MypageMapper mypageMapper;


    //회원 이름 조회
    public String findUserName(Long userNumber) {
        return mypageMapper.selectName(userNumber);
    }

//    보드 작성 개수 조회
    public Long countBoard(Long userNumber) {
        return mypageMapper.selectBoardCount(userNumber);
    }

    public void register(UserDto userDto) {
        mypageMapper.insert(userDto);
    }


}
