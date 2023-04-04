package com.Blogging.Vlog.Dtos;

import lombok.Data;

@Data
public class CommentRequest {
    private String commentDescription;
    private int blogId;

    private int userId;
}
