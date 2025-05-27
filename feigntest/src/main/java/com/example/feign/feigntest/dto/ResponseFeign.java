package com.example.feign.feigntest.dto;

import lombok.Data;

@Data
public class ResponseFeign {

    private String name;
    private String email;
    private String mobileNumber;
    private AccountsDto accountsDto;

}
