package com.lyao.practice.springbootjpa;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan("com.lyao.practice.springbootjpa.dao")
public class SpringBootJpaApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringBootJpaApplication.class, args);
	}
}
