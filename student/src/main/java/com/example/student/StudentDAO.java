package com.example.student;


import java.util.List;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class StudentDAO {
	@Autowired
	StudentList list1;
	public List<StudentBean> getStudents()
	{
		return list1.getStudentlist();
	}
	public List<StudentBean> getDetails(String rollnum)
	{
		return list1.getStudentlist().stream()
		.filter(e->e.getRollnum().equals(rollnum))
		.collect(Collectors.toList());
	}
	public String insertStudent(StudentBean sb)
	{
		list1.getStudentlist().add(sb);
		return "added successfully";
	}
}

