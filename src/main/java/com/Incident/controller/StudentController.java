package com.Incident.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.Incident.model.Student;

@RestController
@RequestMapping("/student")
public class StudentController {
	
	private List<Student> studentList = new ArrayList<>();
	
	
	@PostMapping("/add")
	public String addStudent(@RequestBody Student student){
		studentList.add(student);
		return "Student add Successfully";
	}
	
	@GetMapping("all")
	public List<Student> getAll(){
		return studentList;
	}

}
