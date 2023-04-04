package com.Blogging.Vlog.Dtos;

import lombok.Data;

@Data
public class UserUpdateRequest {
    private int id;
    private String mobile;
    private String email;

}
