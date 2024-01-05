package com.example.jumak.service.mypage;

import com.example.jumak.domain.dto.qa.QaDto;
import com.example.jumak.domain.vo.myPage.InquiryVo;
import com.example.jumak.mapper.mypage.InquiryMapper;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
@RequiredArgsConstructor
@Transactional
public class InquiryService {

    private final InquiryMapper inquiryMapper;

//    문의 내역 조회
    public List<InquiryVo> findInquiry(InquiryVo inquiryVo){
        List<InquiryVo> selectInquiryList = inquiryMapper.selectInquiry(inquiryVo);

        return selectInquiryList;
    }

//    문의 등록
    public void register(QaDto qaDto) {
        inquiryMapper.insertInquiry(qaDto);
    }

//    1:1문의 상세보기
    public QaDto findInquiryDetail(QaDto qaDto) {
        QaDto selectInquiryDetail = inquiryMapper.selectInquiryDetail(qaDto);

        return selectInquiryDetail;
    }
}
