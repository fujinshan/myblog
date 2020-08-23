package com.fjs.myblog.service;

import com.fjs.myblog.NotFoundException;
import com.fjs.myblog.dao.TypeRepository;
import com.fjs.myblog.entity.Type;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;

/**
 * Created by fjs72 on 2020/8/23 12:18
 */
@Service
public class TypeServiceImpl implements TypeService {
    @Autowired
    private TypeRepository typeRepository;
    @Override
    @Transactional
    public Type saveType(Type type) {
        return typeRepository.save(type);
    }

    @Transactional
    @Override
    public Type getType(Long id) {
        return typeRepository.getOne(id);
    }

    @Override
    @Transactional
    public Page<Type> listType(Pageable pageable) {
        return typeRepository.findAll(pageable);
    }

    @Override
    @Transactional
    public Type updateType(Long id, Type type) {
        Type t= typeRepository.getOne(id);
        if(t==null)
        {
            throw new NotFoundException("不存在id");
        }
        BeanUtils.copyProperties(type,t);
        typeRepository.save(t);
        return null;
    }

    @Override
    @Transactional
    public void deleteType(Type type) {
     typeRepository.deleteById(type.getId());
    }
}
