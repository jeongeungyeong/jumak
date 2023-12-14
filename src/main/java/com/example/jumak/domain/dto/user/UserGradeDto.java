package com.example.jumak.domain.dto.user;

import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.stereotype.Component;

@Component
@Data
@NoArgsConstructor
public class UserGradeDto {
    private Long userGradeNumber;
    private String userGradeName;
}
