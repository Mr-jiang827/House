package com.housedemo.houseapi.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDateTime;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class LoginTokenDto {

    private Integer uid;
    private String phone;
    private LocalDateTime localDateTime;
}
