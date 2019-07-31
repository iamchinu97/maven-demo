package com.example.student;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;

@Service
public class StudentList {
	private List<StudentBean> studentlist;
	public StudentList()
	{
		studentlist= new ArrayList<>();
		studentlist.add(new StudentBean("1001","chinmay","shimpi","IT"));
		studentlist.add(new StudentBean("1003","rajat","paliwal","IT"));
		studentlist.add(new StudentBean("1031","ramya","dhondge","CS"));
	}
	public List<StudentBean> getStudentlist() {
		return studentlist;
	}
	public void setStudentlist(List<StudentBean> studentlist) {
		this.studentlist = studentlist;
	}
	@Override
	public String toString() {
		return "StudentList [studentlist=" + studentlist + "]";
	}
	
}
