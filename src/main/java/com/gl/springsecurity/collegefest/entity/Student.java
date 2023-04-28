package com.gl.springsecurity.collegefest.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
public class Student {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;

	@Column(name = "First_Name")
	private String First_Name;

	@Column(name = "Last_Name")
	private String Last_Name;

	@Column(name = "Course")
	private String Course;

	@Column(name = "Country")
	private String Country;

}
