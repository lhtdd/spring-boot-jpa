package com.lyao.practice.springbootjpa.dao;

import com.lyao.practice.springbootjpa.domain.ClassDO;
import java.util.List;

public interface ClassDOMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(ClassDO record);

    ClassDO selectByPrimaryKey(Integer id);

    List<ClassDO> selectAll();

    int updateByPrimaryKey(ClassDO record);
}