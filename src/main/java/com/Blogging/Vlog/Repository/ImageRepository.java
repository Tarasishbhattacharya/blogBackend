package com.Blogging.Vlog.Repository;

import com.Blogging.Vlog.Model.Image;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ImageRepository  extends JpaRepository<Image,Integer> {
}
