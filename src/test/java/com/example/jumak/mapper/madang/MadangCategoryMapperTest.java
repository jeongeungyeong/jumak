package com.example.jumak.mapper.madang;

import com.example.jumak.domain.dto.madang.MadangCategoryDto;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@SpringBootTest
@Transactional
class MadangCategoryMapperTest {
    @Autowired
    MadangCategoryMapper madangCategoryMapper;

    @Test
    void selectAll(){
        List<MadangCategoryDto> list = madangCategoryMapper.selectAll();

        list.forEach(System.out::println);
    }
}















