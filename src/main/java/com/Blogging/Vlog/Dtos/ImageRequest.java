package com.Blogging.Vlog.Dtos;

import lombok.Data;

@Data
public class ImageRequest {
    private String imageTitle;
    private String imageUrl;

    private int blogId;
}
