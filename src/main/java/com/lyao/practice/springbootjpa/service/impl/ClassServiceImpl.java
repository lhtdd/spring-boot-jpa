package com.lyao.practice.springbootjpa.service.impl;

import com.lyao.practice.springbootjpa.dao.ClassDOMapper;
import com.lyao.practice.springbootjpa.domain.ClassDO;
import com.lyao.practice.springbootjpa.service.ClassService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @author lyao
 * @date 2018/9/25 14:37
 * @description
 */
@Service("classService")
public class ClassServiceImpl implements ClassService{

    @Autowired
    public ClassDOMapper classDOMapper;

    @Override
    public ClassDO selectByPrimaryKey(Integer id) {
        return classDOMapper.selectByPrimaryKey(id);
    }
}
