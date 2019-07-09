package com.lyao.practice.springbootjpa.dao.jpa;

import com.lyao.practice.springbootjpa.domain.jpa.Student;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * @author lyao
 * @date 2018/9/20 11:06
 * @description
 */
public interface StudentRepository extends JpaRepository<Student, Integer> {

}
