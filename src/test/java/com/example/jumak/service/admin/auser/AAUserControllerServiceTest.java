package com.example.jumak.service.admin.auser;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.*;


@SpringBootTest
class AAUserControllerServiceTest {
    @Autowired
    AUserService aUserService;

    @BeforeEach
    void setUp() {
    }

    @Test
    void finalAll() {
        aUserService.finalAll();
    }
}