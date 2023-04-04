package com.Blogging.Vlog.Controller;

import com.Blogging.Vlog.Dtos.UserRequest;
import com.Blogging.Vlog.Dtos.UserUpdateRequest;
import com.Blogging.Vlog.Model.User;
import com.Blogging.Vlog.Service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/user")
public class UserController {
    @Autowired
    UserService userService;

    @PostMapping("/add")
    public String CreateUser(@RequestBody()UserRequest userRequest){

        return  userService.addUser(userRequest);
    }
    @GetMapping("/user_by_id")
    public User getUser(@RequestParam("id") int id){
        return userService.getById(id);
    }

   @GetMapping("/get_all")
    public List<User> getAllUser(){
        return userService.getAll();
   }

   @PutMapping("/update")
   public String updateUser(@RequestBody()UserUpdateRequest userUpdateRequest){
        return userService.userUpdate(userUpdateRequest);
   }

   @DeleteMapping("/delete_user")
    public String deleteById(@RequestParam("id")int id){
        return userService.deleteUser(id);

   }

}
