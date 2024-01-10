package com.example.jumak.mapper.madang;

import com.example.jumak.domain.vo.madang.MadangDetailVo;
import com.example.jumak.domain.vo.madang.MadangVo;
import com.example.jumak.domain.vo.product.Criteria;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest
@Transactional
class MadangMapperTest {
    @Autowired
    MadangMapper madangMapper;

    @Test
    void selectListByCate(){
        List<MadangVo> madangVoList = madangMapper.selectListByCate(1L, new Criteria());

        madangVoList.forEach(System.out::println);
    }

    @Test
    void selectDetail(){
        MadangDetailVo madangDetailVo = madangMapper.selectDetail(21L).get();
        System.out.println("madangDetailVo = " + madangDetailVo);
    }
}












