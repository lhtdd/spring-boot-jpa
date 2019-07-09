package com.lyao.practice.springbootjpa.service;

import com.lyao.practice.springbootjpa.domain.ClassDO;

/**
 * @author lyao
 * @date 2018/9/25 14:36
 * @description
 */
public interface ClassService {
    ClassDO selectByPrimaryKey(Integer id);
}
