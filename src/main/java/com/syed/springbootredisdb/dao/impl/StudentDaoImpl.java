package com.syed.springbootredisdb.dao.impl;

import java.util.Map;

import org.springframework.data.redis.core.HashOperations;
import org.springframework.stereotype.Repository;

import com.syed.springbootredisdb.dao.IStudentDao;
import com.syed.springbootredisdb.model.Student;

import jakarta.annotation.Resource;

@Repository
public class StudentDaoImpl implements IStudentDao{
	
	private final String KEY="STUDENT";
	
	//ref type, key type, val type
	@Resource(name="rt")
	private HashOperations<String,Integer,Student> opr;

	@Override
	public void addStudent(Student s) {
		//create new record in Hashmemory if given id not exist
		opr.putIfAbsent(KEY, s.getStdId(), s);
		
	}

	@Override
	public void modifyStudent(Student s) {
		//update data with given id
		opr.put(KEY, s.getStdId(), s);
		
	}

	@Override
	public Student getOneStudent(Integer id) {
		//read one record based on HashRef and Id
		return opr.get(KEY, id);
	}

	@Override
	public Map<Integer, Student> getAllStudent() {
		// HashRef Get all rows as map
		return opr.entries(KEY);
	}

	@Override
	public void removeStudent(Integer id) {
		//HashRef,key
		opr.delete(KEY, id);
		
	}

}
