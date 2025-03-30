package com.haruhandal.mapper;

import com.haruhandal.dto.UserDto;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface UserMapper {
    List<UserDto> findAllUser();
}
