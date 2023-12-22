package com.example.jumak.mapper.product;

import com.example.jumak.domain.dto.product.SearchUserDTO;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface SearchUserMapper {
    public void insertSearchUser (SearchUserDTO searchUserDTO);
}
