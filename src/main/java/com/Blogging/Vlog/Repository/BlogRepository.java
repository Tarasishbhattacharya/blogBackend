package com.Blogging.Vlog.Repository;

import com.Blogging.Vlog.Model.Blog;
import org.springframework.data.jpa.repository.JpaRepository;

public interface BlogRepository  extends JpaRepository<Blog,Integer> {
}
