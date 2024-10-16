package com.Incident.controller;

import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.Incident.model.Student;

@RestController
@RequestMapping("/group")
public class StudentGroupController {
	
	private final StudentController  studentcontroller;
	
	public StudentGroupController(StudentController studentcontroller) {
		this.studentcontroller = studentcontroller;
	}
	
	@GetMapping("/byCode")
	public Map<String, List<Student>> groupByCource(){
		List<Student> students = studentcontroller.getAll();
		return students.stream().collect(Collectors.groupingBy(Student::getCource));
	}

}
