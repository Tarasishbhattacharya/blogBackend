package com.Blogging.Vlog.Repository;

import com.Blogging.Vlog.Model.Comment;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CommentRepository extends JpaRepository<Comment,Integer> {
}
