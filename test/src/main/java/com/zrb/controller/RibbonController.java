package com.zrb.controller;

import com.zrb.bean.User;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Author Ruibiao Zhang, <rbzhang@mobvoi.com>
 * @Date 2018/9/30
 */
@RestController
public class RibbonController {
    @GetMapping(value = "/ribbon")
    public Object ribbonTest(){
        User user = new User();
        user.setAge(12);
        user.setName("zhangsan");
        return user;
    }
}
