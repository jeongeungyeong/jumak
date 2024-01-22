package com.example.jumak.domain.dto.product;

import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.stereotype.Component;


@Data
@NoArgsConstructor
public class SearchUserDTO {
    private Long searchUserNum;
    private String searchUserName;
    private String searchUserId;
    private String searchUserPassword;
    private String searchUserPhone;
    private String searchUserGender;
    private String searchUserEmail;
    private String searchUserAddress;

    public SearchUserDTO(Long searchUserNum, String searchUserName, String searchUserId, String searchUserPassword, String searchUserPhone, String searchUserGender, String searchUserEmail, String searchUserAddress) {
        this.searchUserNum = searchUserNum;
        this.searchUserName = searchUserName;
        this.searchUserId = searchUserId;
        this.searchUserPassword = searchUserPassword;
        this.searchUserPhone = searchUserPhone;
        this.searchUserGender = searchUserGender;
        this.searchUserEmail = searchUserEmail;
        this.searchUserAddress = searchUserAddress;
    }

    @Override
    public String toString() {
        return "SearchUserDTO{" +
                "searchUserNum=" + searchUserNum +
                ", searchUserName='" + searchUserName + '\'' +
                ", searchUserId='" + searchUserId + '\'' +
                ", searchUserPassword='" + searchUserPassword + '\'' +
                ", searchUserPhone='" + searchUserPhone + '\'' +
                ", searchUserGender='" + searchUserGender + '\'' +
                ", searchUserEmail='" + searchUserEmail + '\'' +
                ", searchUserAddress='" + searchUserAddress + '\'' +
                '}';
    }
}


