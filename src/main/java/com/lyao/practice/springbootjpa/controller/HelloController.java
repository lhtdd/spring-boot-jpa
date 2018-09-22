package com.lyao.practice.springbootjpa.controller;

import com.lyao.practice.springbootjpa.dao.jpa.StudentRepository;
import org.springframework.beans.factory.annotation.Autowired;
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

    @RequestMapping("/index")
    public String hello(){
        return studentRepository.getOne(2).getName();
    }
}
