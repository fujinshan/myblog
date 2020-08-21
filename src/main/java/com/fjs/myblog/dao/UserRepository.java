package com.fjs.myblog.dao;

import com.fjs.myblog.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * Created by fjs72 on 2020/8/16 16:46
 */
public interface UserRepository extends JpaRepository<User,Long> {
    User findByUsernameAndPassword(String username, String password);
}
