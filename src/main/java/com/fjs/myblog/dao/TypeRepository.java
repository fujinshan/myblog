package com.fjs.myblog.dao;

import com.fjs.myblog.entity.Type;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * Created by fjs72 on 2020/8/23 12:19
 */
public interface TypeRepository extends JpaRepository<Type,Long> {
}
