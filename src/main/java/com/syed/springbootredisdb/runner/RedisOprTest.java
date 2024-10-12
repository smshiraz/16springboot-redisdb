package com.syed.springbootredisdb.runner;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import com.syed.springbootredisdb.dao.IStudentDao;
import com.syed.springbootredisdb.model.Student;
@Component
public class RedisOprTest implements CommandLineRunner{
	@Autowired
	private IStudentDao dao;

	@Override
	public void run(String... args) throws Exception {
		
		dao.addStudent(new Student(101,"SAM",500.25));
		dao.addStudent(new Student(102,"SYED",800.25));
		dao.addStudent(new Student(103,"RAM",600.25));
		
		dao.getAllStudent().forEach((k,v)->System.out.println(k+"---"+v));
		
		dao.removeStudent(101);
		dao.modifyStudent(new Student(103, "RAM RAJ", 650.25));
		System.out.println("After remove/modify");
		dao.getAllStudent().forEach((k,v)->System.out.println(k+"---"+v));
	}

}
