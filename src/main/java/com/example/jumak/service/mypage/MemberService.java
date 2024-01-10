package com.example.jumak.service.mypage;

import com.example.jumak.domain.dto.user.UserDto;
import com.example.jumak.domain.vo.myPage.MemberVo;
import com.example.jumak.mapper.mypage.MemberMapper;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@RequiredArgsConstructor
@Transactional
public class MemberService {
    private final MemberMapper memberMapper;
//  맴버정보조회
    public UserDto findMemeber(Long userNumber) {
        return memberMapper.selectMember(userNumber);
    }

//    비번확인
    public Long enterPassword(MemberVo memberVo) { return memberMapper.enterPassword(memberVo);}

//    맴버 정보 업데이트
    public void modifyMember(MemberVo memberVo) { memberMapper.updateMember(memberVo);}
}
