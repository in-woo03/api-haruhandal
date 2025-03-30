package com.haruhandal.controller;

import com.haruhandal.dto.UserDto;
import com.haruhandal.service.UserService;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.tags.Tag;
import lombok.RequiredArgsConstructor;
import lombok.extern.log4j.Log4j2;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@Log4j2
@RestController
@RequestMapping("/user")
@RequiredArgsConstructor
@Tag(name = "사용자 API", description = "사용자 API에 대한 설명")
public class UserController {
    private final UserService userService;

    @GetMapping("/userList")
    @Operation(summary = "사용자 리스트 API 호출", description = "사용자 리스트 API를 호출합니다.")
    public ResponseEntity<List<UserDto>> getAllUser() {
        return ResponseEntity.ok(userService.findAllUser());
    }
}
