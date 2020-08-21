package com.fjs.myblog.service;

import com.fjs.myblog.entity.User;
import com.fjs.myblog.dao.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * Created by fjs72 on 2020/8/16 16:42
 */
@Service
public class UserServiceImpl implements UserService{
    @Autowired
    private UserRepository userRepository;

    @Override
    public User checkUser(String username, String password) {

        User user = userRepository.findByUsernameAndPassword(username,password);
        return user;
    }
}
