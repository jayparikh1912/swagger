package com.swagger.demo.User;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/v1")
public class UserController {
    @Autowired
    private UserRepo repo;

    @PostMapping("/save/{number}")
    private String save(@PathVariable Long number) {
        User user = new User();
        user.setPhoneNumber(number);
        repo.save(user);
        return "saved";
    }
}
