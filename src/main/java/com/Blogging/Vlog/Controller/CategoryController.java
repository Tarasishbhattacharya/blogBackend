package com.Blogging.Vlog.Controller;

import com.Blogging.Vlog.Dtos.CategoryRequest;
import com.Blogging.Vlog.Model.Blog;
import com.Blogging.Vlog.Model.Category;
import com.Blogging.Vlog.Service.CategoryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/category")
public class CategoryController {


    @Autowired
    CategoryService categoryService;

    @PostMapping("/add")
    public String addCat(@RequestBody()CategoryRequest categoryRequest){
        return categoryService.createCategory(categoryRequest);
    }

    @GetMapping("/get_by_id")
    public Category getCat(@RequestParam("id") int id){
        return categoryService.getCategory(id);
    }
    @GetMapping("/get_all")
    public List<Category> allCat(){

        return categoryService.allCategory();
    }

    @GetMapping("/get_all_by_category")
    public List<Blog> getAllByCat(@RequestParam("id") int id){
        return categoryService.getAllBlog(id);
    }

}
