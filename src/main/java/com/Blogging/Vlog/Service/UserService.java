package com.Blogging.Vlog.Service;

import com.Blogging.Vlog.Dtos.UserRequest;
import com.Blogging.Vlog.Dtos.UserUpdateRequest;
import com.Blogging.Vlog.Model.User;
import com.Blogging.Vlog.Repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.List;

@Service
public class UserService {
    @Autowired
    UserRepository userRepository;

    public String addUser(UserRequest userRequest){
        User user=User.builder().name(userRequest.getName()).age(userRequest.getAge())
                .email(userRequest.getEmail()).country(userRequest.getCountry()).build();

        userRepository.save(user);

        return "New User added";
    }
    public User getById(int id){
        return userRepository.findById(id).get();
    }
    public List<User> getAll(){
        return userRepository.findAll();
    }

    public String deleteUser(int id){
        userRepository.deleteById(id);
        return "user deleted";
    }
    public String userUpdate(UserUpdateRequest userUpdateRequest){
        User user=userRepository.findById(userUpdateRequest.getId()).get();
        user.setMobile(userUpdateRequest.getMobile());
        user.setEmail(userUpdateRequest.getEmail());
        userRepository.save(user);
        return "user updated";
    }

}
