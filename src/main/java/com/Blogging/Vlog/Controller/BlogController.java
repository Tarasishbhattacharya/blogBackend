package com.Blogging.Vlog.Controller;

import com.Blogging.Vlog.Dtos.BlogRequest;
import com.Blogging.Vlog.Model.Blog;
import com.Blogging.Vlog.Service.BlogService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/blog")
public class BlogController {

    @Autowired
    BlogService blogService;

    @GetMapping("/add")
    public String addBlog(@RequestBody()BlogRequest blogRequest){
        return blogService.createBlog(blogRequest);
    }
    @GetMapping("/get_by_id")
    public Blog getById(@RequestParam("id") int id){

        return blogService.getBlog(id);
    }

    @GetMapping("/get_all_by_user")
    public List<Blog> getAllBlog(@RequestParam("id") int id){
        return blogService.getAll(id);
    }


}
