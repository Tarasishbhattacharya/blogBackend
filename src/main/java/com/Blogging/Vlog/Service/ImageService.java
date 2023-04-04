package com.Blogging.Vlog.Service;

import com.Blogging.Vlog.Dtos.ImageRequest;
import com.Blogging.Vlog.Model.Blog;
import com.Blogging.Vlog.Model.Image;
import com.Blogging.Vlog.Repository.BlogRepository;
import com.Blogging.Vlog.Repository.ImageRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ImageService {
    @Autowired
    ImageRepository imageRepository;
    @Autowired
    BlogRepository blogRepository;

    public String createImage(ImageRequest imageRequest){
        Blog blog=blogRepository.findById(imageRequest.getBlogId()).get();
        Image image=Image.builder().imageTitle(imageRequest.getImageTitle())
                .imageUrl(imageRequest.getImageUrl()).build();

        image.setBlog(blog);
        blog.getImageList().add(image);
        blogRepository.save(blog);
        return "new Blog added";
    }

}
