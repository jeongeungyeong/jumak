package com.example.jumak.service.mypage;

import com.example.jumak.domain.dto.user.UserDto;
import com.example.jumak.mapper.mypage.MemberMapper;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
@RequiredArgsConstructor
@Transactional
public class MemberService {
    private final MemberMapper memberMapper;

    public UserDto findMemeber(Long userNumber) {
        return memberMapper.selectMember(userNumber);
    }
}
