package com.Blogging.Vlog.Service;

import com.Blogging.Vlog.Dtos.CategoryRequest;
import com.Blogging.Vlog.Model.Blog;
import com.Blogging.Vlog.Model.Category;
import com.Blogging.Vlog.Repository.CategoryRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CategoryService {
    @Autowired
    CategoryRepository categoryRepository;
    public String createCategory(CategoryRequest categoryRequest){
        Category category=Category.builder().categoryName(categoryRequest.getName()).build();
        categoryRepository.save(category);
        return " New Category added";
    }

    public Category getCategory(int id){
        return categoryRepository.findById(id).get();
    }

    public List<Category> allCategory(){
        return categoryRepository.findAll();
    }

    public List<Blog> getAllBlog(int id){
        Category category=categoryRepository.findById(id).get();
        List<Blog>blogList=category.getBlogList();
        return blogList;
    }
}
