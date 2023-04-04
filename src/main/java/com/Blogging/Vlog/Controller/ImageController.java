package com.Blogging.Vlog.Controller;

import com.Blogging.Vlog.Dtos.BlogRequest;
import com.Blogging.Vlog.Dtos.ImageRequest;
import com.Blogging.Vlog.Service.ImageService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/blog")
public class ImageController {

    @Autowired
    ImageService imageService;

    @PostMapping("/add")
    public String addBlog(@RequestBody()ImageRequest imageRequest){
        return imageService.createImage(imageRequest);
    }
}
