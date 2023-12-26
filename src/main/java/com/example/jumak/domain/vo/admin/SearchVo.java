package com.example.jumak.domain.vo.admin;


import lombok.Data;
import org.springframework.stereotype.Component;

@Component
@Data
public class SearchVo {
    private String searchType;
    private String keyword;
}
