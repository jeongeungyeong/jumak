package com.example.jumak.domain.dto.user;

import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.stereotype.Component;

@Component
@Data
@NoArgsConstructor
public class UserDto {
    private Long userNumber;
    private String userId;
    private String userPassword;
    private String userName;
    private String userNickname;
    private String userEmail;
    private String userCellphoneNumber;
    private String userPhoneNumber;
    private String userAddress;
    private String userAddressDetail;
    private Long userZipcode;
    private String userBirth;
    private Long userGradeNumber;
}