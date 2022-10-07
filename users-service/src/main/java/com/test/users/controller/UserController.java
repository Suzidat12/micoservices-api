package com.test.users.controller;

import com.test.users.VO.ResponseTemplateVO;
import com.test.users.entity.User;
import com.test.users.service.UserService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/users")
@Slf4j
public class UserController {
    @Autowired
    private UserService userService;

    @PostMapping("/")
    public User saveUser(@RequestBody User user){
        log.info("Inside saveUser for UserController");
        return userService.saveUser(user);
    }
    @GetMapping("/{id}")
    public ResponseTemplateVO getUserWithDepartment(@PathVariable("id") Long userId){
        log.info("Inside getUserWithDepartmentfor UserController");
        return userService.getUserWithDepartment(userId);
    }

    @GetMapping("/message")
    public String test() {
        return "Hello this is my second microservice";
    }
}
