package com.haruhandal.service;

import com.haruhandal.dto.UserDto;
import com.haruhandal.mapper.UserMapper;
import lombok.RequiredArgsConstructor;
import lombok.extern.log4j.Log4j2;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Log4j2
@Service
@RequiredArgsConstructor
public class UserService {
    private final UserMapper userMapper;

    @Transactional
    public List<UserDto> findAllUser() {
        log.info("user111111111"+ userMapper.findAllUser());
        return userMapper.findAllUser();
    }
}
