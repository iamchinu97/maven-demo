package com.example.student;

import java.util.ArrayList;
import java.util.List;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
public class StudentApplicationTests {

	@Autowired
	StudentDAO sdt;
	List<StudentBean> sbt=null;
	@Before
	public void setup()
	{
		sbt= new ArrayList<StudentBean>();
		sbt.add(new StudentBean("1001","chinmay","shimpi","IT"));
		sbt.add(new StudentBean("1003","rajat","paliwal","IT"));
		sbt.add(new StudentBean("1031","ramya","dhondge","CS"));
	}
	@Test
	public void getDetailsTest(){
		if(sdt.getDetails("1001").size()>0)
		{
			Assert.assertEquals(sdt.getDetails("1001").get(0),sbt.get(0));			
		}
		else
		{
			Assert.fail("No student found");
		}
	}
	@Test
	public void getDetailsFailTest()
	{
		Assert.assertEquals(sdt.getDetails("2001").size(), 0);
	}
	@Test
	public void getStudentsTest()
	{
		Assert.assertArrayEquals(sdt.getStudents().toArray(), sbt.toArray());
	}

}
