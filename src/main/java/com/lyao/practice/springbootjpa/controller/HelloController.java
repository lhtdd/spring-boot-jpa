package com.lyao.practice.springbootjpa.controller;

import com.lyao.practice.springbootjpa.dao.jpa.StudentRepository;
import com.lyao.practice.springbootjpa.domain.ClassDO;
import com.lyao.practice.springbootjpa.service.ClassService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author lyao
 * @date 2018/9/20 10:24
 * @description
 */
@RestController
public class HelloController {

    @Autowired
    public StudentRepository studentRepository;

    @Autowired
    public ClassService classService;

    @RequestMapping("/index")
    public String hello(){
        return studentRepository.getOne(2).getName();
    }


    @RequestMapping("/myClass/{id}")
    public String myClass(@PathVariable String id){
        ClassDO classDO = classService.selectByPrimaryKey(Integer.valueOf(id));
        return classDO.getClassName();
    }
}
