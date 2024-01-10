package com.example.jumak.mapper.main;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest
class MainMapperTest {
    @Autowired
    MainMapper mainMapper;

    @BeforeEach
    void setUp() {
    }

    @Test
    void selectSearch() {
        mainMapper.selectSearch("상큼");
    }

    @Test
    void selectTag() {
        Integer[] tagArray = {1,2};
        mainMapper.selectTag(tagArray,tagArray.length,1l,2L);

    }

}