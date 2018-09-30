package com.zrb.controller;

import com.zrb.domain.User;
import com.zrb.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Author Ruibiao Zhang, <rbzhang@mobvoi.com>
 * @Date 2018/9/2
 */
@RestController
public class UserController {

    @Autowired
    private UserService userService;

    @GetMapping("/user/list")
    public Object getUserList(){
        return null;
    }

    @PostMapping("/user/add")
    public Object addUser(@RequestBody User user){
        user.setName(user.getName());
        if(userService.save(user)){
            return user;
        }
        return null;
    }


}
