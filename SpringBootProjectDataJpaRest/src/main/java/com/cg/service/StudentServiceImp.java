package com.cg.service;d

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cg.dao.StudentDaoI;
import com.cg.entity.Student;
@Service
public class StudentServiceImp implements StudentServiceI {

	@Autowired
	StudentDaoI studentdao;
	@Override
	public List reterive() {
		return studentdao.reterive();
	}
	@Override
	public void create(Student s) {

		studentdao.create(s);
	}
	@Override
	public Student findbyId(int id) {
		return studentdao.findById(id);
	}
	@Override
	public void delete(int id)
	{
		Student st= studentdao.findById(id);
		if(st!=null)
			studentdao.delete(id);
		else
			throw new RuntimeException("no id exists");
		
	}

}
