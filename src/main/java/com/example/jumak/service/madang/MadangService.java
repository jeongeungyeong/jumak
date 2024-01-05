package com.example.jumak.service.madang;

import com.example.jumak.domain.dto.madang.MadangCategoryDto;
import com.example.jumak.domain.dto.madang.MadangDto;
import com.example.jumak.domain.vo.madang.MadangDetailVo;
import com.example.jumak.domain.vo.madang.MadangVo;
import com.example.jumak.domain.vo.product.Criteria;
import com.example.jumak.mapper.madang.MadangCategoryMapper;
import com.example.jumak.mapper.madang.MadangMapper;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
@Transactional
@RequiredArgsConstructor
public class MadangService {
    private final MadangMapper madangMapper;
    private final MadangCategoryMapper categoryMapper;

    public void register(MadangDto madangDto){
        madangMapper.insert(madangDto);
    }

//    카테고리 조회
    public List<MadangCategoryDto> findAllCategory(){
        return categoryMapper.selectAll();
    }

//    카테고리 별 리스트 조회
    public List<MadangVo> findListByCate(Long madangCategoryNumber, Criteria criteria){
        return madangMapper.selectListByCate(madangCategoryNumber, criteria);
    }

    //    마당 토탈 카운트(카테고리별)
    public int findTotal(Long madangCategoryNumber){
        return madangMapper.selectTotal(madangCategoryNumber);
    }

    //    마당 상세보기
    public MadangDetailVo findDetail(Long madangNumber){
//        마당 조회수 증가
        madangMapper.updateViewCount(madangNumber);
        return madangMapper.selectDetail(madangNumber)
                .orElseThrow(() -> new IllegalStateException("존재하지 않는 게시물"));
    }

}
