package com.example.jumak.service.admin.auser;

import com.example.jumak.domain.dto.user.UserDto;
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

    public List<UserDto> finalAll(){
        return AUserMapper.selectAll();
    };

    public void remove(Long userNumber){
        AUserMapper.delete(userNumber);
    }
}
