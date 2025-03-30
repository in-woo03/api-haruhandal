package com.haruhandal.dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDateTime;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class UserDto {
    private String userId;
    private String userName;
    private String email;
    private String role;
    private LocalDateTime crtDtm;
    private LocalDateTime updDtm;
    private LocalDateTime lastLoginDtm;
    private String userState;

}
