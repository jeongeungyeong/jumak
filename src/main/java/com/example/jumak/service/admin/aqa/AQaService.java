package com.example.jumak.service.admin.aqa;

import com.example.jumak.domain.vo.admin.ACriteria;
import com.example.jumak.domain.vo.admin.AQaVo;
import com.example.jumak.mapper.admin.aqa.AQaMapper;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
@Transactional
@RequiredArgsConstructor
public class AQaService {
    private final AQaMapper aQaMapper;

//    리스트 조회
    public List<AQaVo> findList(ACriteria aCriteria){
        return aQaMapper.selectList(aCriteria);
    }

    //    qa total
    public int findTotal(){
      return aQaMapper.selectTotal();
    }

//    상세 조회
    public AQaVo findOne(Long qaNumber){
        return aQaMapper.selectOne(qaNumber);
    }

//  답변 수정
    public void modifyReply(String qaReply,Long qaNumber){
      aQaMapper.updateReply(qaReply,qaNumber);
    }
}
