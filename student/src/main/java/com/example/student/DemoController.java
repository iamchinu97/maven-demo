package com.example.student;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DemoController {
	@Autowired
	StudentDAO sd;
	@GetMapping("/hello")
	public String Display()
	{
		return "Welcome to microservices";
	}
	@GetMapping("/student")
	public StudentBean displayStudent()
	{
		StudentBean sb = new StudentBean("1001","rajta","paliwal","IT");
		return sb;
	}
	@GetMapping("/students")
	public List<StudentBean> getStudentList()
	{
		 return sd.getStudents();
	}
	@GetMapping("/student/{rollnum}")
	public List<StudentBean> getStudentDetails(@PathVariable String rollnum)
	{
		 return sd.getDetails(rollnum);
	}
	@RequestMapping( value = "/insert", method = RequestMethod.POST)
	public String insert(@RequestBody StudentBean sb)
	{
		return sd.insertStudent(sb);
	}
}