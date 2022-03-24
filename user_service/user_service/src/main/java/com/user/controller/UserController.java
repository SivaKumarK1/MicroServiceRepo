package com.user.controller;

import com.user.entity.User;
import com.user.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.client.RestTemplate;

import java.util.List;

@RestController
@RequestMapping("/user")
public class UserController {


    @Autowired
    private UserService userService;

    @Autowired
    private RestTemplate restTemplate;

    @PostMapping("/")
    public User saveUser(@RequestBody User user){
        userService.saveUserData(user);
        return user;
    }


    @GetMapping("/{userId}")
    public User getUser(@PathVariable("userId") Long userId) {

        User user =  userService.getUser(userId);
        //http://localhost:9002/contact/user/1311

        List contacts = this.restTemplate.getForObject("http://localhost:8081/contact/user/" + user.getUserId(), List.class);


        user.setContacts(contacts);
        return user;

    }

}
