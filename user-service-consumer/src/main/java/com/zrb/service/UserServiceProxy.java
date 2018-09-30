package com.zrb.service;

import com.zrb.domain.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import java.util.List;

/**
 * @Author Ruibiao Zhang, <rbzhang@mobvoi.com>
 * @Date 2018/9/2
 */
@Service
public class UserServiceProxy implements UserService{

    private static final String PROVIDER_SERVER_URL_PREFIX = "http://user-service-provider";

    @Autowired
    private RestTemplate restTemplate;
    @Override
    public boolean save(User user) {
        restTemplate.postForObject(PROVIDER_SERVER_URL_PREFIX+"/user/save",user,User.class);
        return true;
    }

    @Override
    public List<User> findAll() {
        return null;
    }
}
