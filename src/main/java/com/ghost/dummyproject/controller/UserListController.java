package com.ghost.dummyproject.controller;

import com.ghost.dummyproject.model.User;
import com.ghost.dummyproject.model.Warrior;
import com.ghost.dummyproject.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

// @RestController to start making APIs
@RestController
public class UserListController {

    @Autowired                       //Autowired allows you to leave classes unassigned so when needed, it'll use the class to create an object when needed
    UserRepository userRepository;

//    @RequestMapping(value = "/users/user", method = RequestMethod.GET)
//    public List<User> getUserListByName(@RequestParam(value = "name", required = false) String name){
//        List<User> users = userRepository.findByNames(name);
//        return users;
//    }

    @RequestMapping(value = "/users/user", method = RequestMethod.GET)
    public User getUserList(@RequestParam(value = "myid", required = false) String a){    //We can assign a custom parameter name and
        User user = userRepository.findById(a).orElse(null);      //findById instansiated in UserRepository, use user model to hold data and return
        return user;
    }

    @RequestMapping(value = "/user/addUser", method = RequestMethod.POST)
    public String postAddUser(@RequestParam String name,
                              @RequestBody(required = false)String bio,
                              @RequestParam(required = false)String image,
                              @RequestParam(required = false)String profilepicture){
        User user = new User(name,bio,image,profilepicture);
        User savedUser = userRepository.save(user);      //Saves the new user into MongoDB
        return "Success User Created " + savedUser.getId(); //Print UserID after making them (It just gets it immediately after creation)
    }
}
