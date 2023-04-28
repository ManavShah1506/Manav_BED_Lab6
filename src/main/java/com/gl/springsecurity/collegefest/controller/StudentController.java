package com.gl.springsecurity.collegefest.controller;

import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.gl.springsecurity.collegefest.entity.Student;
import com.gl.springsecurity.collegefest.service.StudentService;

@Controller
@RequestMapping("/students")
public class StudentController {
	StudentService stdservice;

	public StudentController(StudentService stdservice) {
		super();
		this.stdservice = stdservice;
	}

	@GetMapping()
	public String showStdList(Model model) {
		model.addAttribute("stds", stdservice.getAllStudent());
		return "students-list";
	}

	@GetMapping("/new")
	public String createStd(Model model, HttpServletRequest request) {
		model.addAttribute("student", new Student());
		model.addAttribute("request", request);
		return "student";
	}

	@GetMapping("/edit/{id}")
	public String editStd(Model model, @PathVariable Long id, HttpServletRequest request) {
		Student student = stdservice.getStudent(id);
		model.addAttribute("student", student);
		model.addAttribute("request", request);
		return "student";
	}

	@GetMapping("/view/{id}")
	public String viewStd(Model model, @PathVariable Long id, HttpServletRequest request) {
		Student student = stdservice.getStudent(id);
		model.addAttribute("student", student);
		model.addAttribute("request", request);
		return "studentview";
	}

	@GetMapping("/delete/{id}")
	public String deleteStd(Model model, @PathVariable Long id) {
		stdservice.deleteStudent(id);
		return "redirect:/students";
	}

	@PostMapping("/save")
	public String saveStd(Model model, @ModelAttribute("student") Student student) {
		stdservice.saveStudent(student);
		return "redirect:/students";
	}

	@GetMapping("/print")
	public String printAllStudents(Model model) {
		model.addAttribute("stds", stdservice.getAllStudent());
		return "print-students";
	}

}
