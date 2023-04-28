package com.gl.springsecurity.collegefest.service;

import java.util.List;

import com.gl.springsecurity.collegefest.entity.Student;

public interface StudentService {

	public List<Student> getAllStudent();

	public Student saveStudent(Student student);

	public Student updateStudent(Student student);

	public Student getStudent(Long id);

	public void deleteStudent(Long id);

}
