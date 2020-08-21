package com.fjs.myblog.service;

import com.fjs.myblog.entity.User;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

/**
 * Created by fjs72 on 2020/8/16 16:41
 */
@Component
public interface UserService {

    User checkUser(String username, String password);
}
