package com.Blogging.Vlog.Repository;

import com.Blogging.Vlog.Model.Category;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CategoryRepository  extends JpaRepository<Category,Integer> {

}
