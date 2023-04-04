package com.Blogging.Vlog.Repository;

import com.Blogging.Vlog.Model.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User,Integer> {

}
