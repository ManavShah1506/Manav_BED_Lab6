package com.gl.springsecurity.collegefest.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.gl.springsecurity.collegefest.entity.Student;

public interface StudentDao extends JpaRepository<Student , Long>{

}
