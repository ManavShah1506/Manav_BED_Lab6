package com.gl.springsecurity.collegefest.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.gl.springsecurity.collegefest.dao.StudentDao;
import com.gl.springsecurity.collegefest.entity.Student;

@Service
public class StudentServiceImpl implements StudentService {
	StudentDao studentDao;

	public StudentServiceImpl(StudentDao studentDao) {
		super();
		this.studentDao = studentDao;
	}

	@Override
	public List<Student> getAllStudent() {
		// TODO Auto-generated method stub
		return studentDao.findAll();
	}

	@Override
	public Student saveStudent(Student student) {
		// TODO Auto-generated method stub
		return studentDao.save(student);
	}

	@Override
	public Student updateStudent(Student student) {
		// TODO Auto-generated method stub
		return studentDao.save(student);
	}

	@Override
	public Student getStudent(Long id) {
		// TODO Auto-generated method stub
		return studentDao.findById(id).get();
	}

	@Override
	public void deleteStudent(Long id) {
		// TODO Auto-generated method stub
		studentDao.deleteById(id);

	}

}
