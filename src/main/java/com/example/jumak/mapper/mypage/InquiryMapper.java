package com.example.jumak.mapper.mypage;

import com.example.jumak.domain.dto.qa.QaDto;
import com.example.jumak.domain.vo.myPage.InquiryVo;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface InquiryMapper {

//    1:1문의 목록 조회
    List<InquiryVo> selectInquiry(InquiryVo inquiryVo);

//    1:1문의 작성
    void insertInquiry(QaDto qaDto);

//    1:1문의 상세보기
    QaDto selectInquiryDetail(QaDto qaDto);
}
