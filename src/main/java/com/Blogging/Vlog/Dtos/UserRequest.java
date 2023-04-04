package com.Blogging.Vlog.Dtos;

import lombok.Data;

@Data
public class UserRequest {
    private String name;
    private int age;
    private String country;
    private String email;
    private String mobile;
}
