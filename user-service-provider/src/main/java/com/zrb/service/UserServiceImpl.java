package com.zrb.service;

import com.zrb.domain.User;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @Author Ruibiao Zhang, <rbzhang@mobvoi.com>
 * @Date 2018/9/2
 */
@Service
public class UserServiceImpl implements UserService{
    @Override
    public boolean save(User user) {
        return false;
    }

    @Override
    public List<User> findAll() {
        return null;
    }
}
