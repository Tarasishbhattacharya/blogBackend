package com.Blogging.Vlog.Service;

import com.Blogging.Vlog.Dtos.BlogRequest;
import com.Blogging.Vlog.Model.Blog;
import com.Blogging.Vlog.Model.Category;
import com.Blogging.Vlog.Model.User;
import com.Blogging.Vlog.Repository.BlogRepository;
import com.Blogging.Vlog.Repository.CategoryRepository;
import com.Blogging.Vlog.Repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class BlogService {

    @Autowired
    BlogRepository blogRepository;
    @Autowired
    UserRepository userRepository;
    @Autowired
    CategoryRepository categoryRepository;

    public String createBlog(BlogRequest blogRequest){
        User user=userRepository.findById(blogRequest.getUserId()).get();
        Category category=categoryRepository.findById(blogRequest.getCategoryId()).get();
        Blog blog=Blog.builder().blogTitle(blogRequest.getBlogTitle()).
                blogDescription(blogRequest.getBlogDescription()).build();

        blog.setUser(user);
        blog.setCategory(category);
        user.getBlogList().add(blog);
        category.getBlogList().add(blog);
        blogRepository.save(blog);
        return "blog added";
    }

    public Blog getBlog(int id){
        return blogRepository.findById(id).get();
    }

    public List<Blog> getAll(int id){
        User user=userRepository.findById(id).get();
        List<Blog> blogList=user.getBlogList();
        return blogList;
    }
}
