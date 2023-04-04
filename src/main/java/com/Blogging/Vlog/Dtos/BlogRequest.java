package com.Blogging.Vlog.Dtos;

import lombok.Data;

@Data
public class BlogRequest {
    private String blogTitle;
    private  String blogDescription;
    private int userId;
    private int categoryId;
}
