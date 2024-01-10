package com.example.jumak.domain.vo.myPage;

import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.stereotype.Component;

@Component
@Data
@NoArgsConstructor
public class MemberVo {
    private Long userNumber;
    private String newPassword;
    private String userPassword;
    private String newNickname;
    private String userNickname;
    private String newEmail;
    private String userEmail;
    private String newPhoneNumber;
    private String userPhoneNumber;
    private Long newZipcode;
    private Long userZipcode;
    private String newAddress;
    private String userAddress;
    private String newAddressDetail;
    private String userAddressDetail;

    private String enterPassword;
}
