package com.fjs.myblog.service;

import com.fasterxml.jackson.annotation.JsonSubTypes;
import com.fjs.myblog.entity.Type;
import net.bytebuddy.dynamic.scaffold.TypeWriter;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

/**
 * Created by fjs72 on 2020/8/23 12:15
 */
public interface TypeService {

    Type saveType(Type type);

    Type getType(Long id);

    Page<Type> listType(Pageable pageable);

    Type updateType(Long id,Type type);

    void deleteType(Type type);


}
