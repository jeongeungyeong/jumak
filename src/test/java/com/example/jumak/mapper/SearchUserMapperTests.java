package com.example.jumak.mapper;

import com.example.jumak.domain.dto.product.SearchUserDTO;
import com.example.jumak.mapper.product.SearchUserMapper;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
public class SearchUserMapperTests {

    @Autowired
    private SearchUserMapper searchUserMapper;

    @Test
    public void testSelect() {
        SearchUserDTO search1 = new SearchUserDTO();
//        -- private Long searchUserNum;
//        -- private String searchUserName;
//        -- private String searchUserId;
//        -- private String searchUserPassword;
//        -- private String searchUserPhone;
//        -- private String searchUserGender;
//        -- private String searchUserEmail;
//        -- private String searchUserAddress;
        search1.setSearchUserNum(1L);
        search1.setSearchUserName( "홍발장" );
        search1.setSearchUserId( "mr.bal" );
        search1.setSearchUserPassword( "1234" );
        search1.setSearchUserPhone( "000-222-2222" );
        search1.setSearchUserGender( "M" );
        search1.setSearchUserEmail( "mr.bal@localhost.net" );
        search1.setSearchUserAddress( "마포구" );
        System.out.println( search1 );
//        searchUserMapper.insertSearchUser( search1 );

        System.out.println("------------------------------");
        System.out.println("레코드가 추가 되었습니다.");
        System.out.println("------------------------------");


    }
}
