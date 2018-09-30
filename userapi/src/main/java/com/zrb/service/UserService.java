package com.zrb.service;

import com.zrb.domain.User;

import java.util.List;

/**
 * @Author Ruibiao Zhang, <rbzhang@mobvoi.com>
 * @Date 2018/9/2
 */
public interface UserService {

    boolean save(User user);

    List<User> findAll();
}
