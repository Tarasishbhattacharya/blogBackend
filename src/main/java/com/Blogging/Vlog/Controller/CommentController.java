package com.Blogging.Vlog.Controller;

import com.Blogging.Vlog.Dtos.CommentRequest;
import com.Blogging.Vlog.Model.Comment;
import com.Blogging.Vlog.Service.CommentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/comment")
public class CommentController {

    @Autowired
    CommentService commentService;

    @PostMapping("/add")
    public String addComment(@RequestBody()CommentRequest commentRequest){
        return commentService.createComment(commentRequest);
    }

    @GetMapping("/get_all_comment")
    public List<Comment> getAllComment(@RequestParam("id") int id){
        return commentService.getComment(id);
    }
}
