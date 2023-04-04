package com.Blogging.Vlog.Service;

import com.Blogging.Vlog.Dtos.CommentRequest;
import com.Blogging.Vlog.Model.Blog;
import com.Blogging.Vlog.Model.Comment;
import com.Blogging.Vlog.Model.User;
import com.Blogging.Vlog.Repository.BlogRepository;
import com.Blogging.Vlog.Repository.CommentRepository;
import com.Blogging.Vlog.Repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CommentService {

    @Autowired
    CommentRepository commentRepository;
    @Autowired
    UserRepository userRepository;

    @Autowired
   BlogRepository blogRepository;

    public String createComment(CommentRequest commentRequest){

        User user=userRepository.findById(commentRequest.getUserId()).get();
        Blog blog=blogRepository.findById(commentRequest.getBlogId()).get();
        Comment comment=Comment.builder().commentDescription(commentRequest.getCommentDescription()).build();
        comment.setUser(user);
        comment.setBlog(blog);
        user.getCommentList().add(comment);
        blog.getCommentList().add(comment);
        blogRepository.save(blog);
        userRepository.save(user);
        return "new comments added";
    }
    public List<Comment> getComment(int id){
        Blog blog=blogRepository.findById(id).get();
        List<Comment> commentList=blog.getCommentList();
        return commentList;
    }
}
