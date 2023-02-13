package com.assignment;

import static org.junit.Assert.*;

import org.junit.Test;
import com.assignment.model.*;
public class TestStudentDao {
	Student sc=new Student("Shraddha","Bangar","shraddhabangar2017@gmail.com");
			
	@Test
	public void testgetFirstName() {
		assertEquals("Shraddha",sc.getFirstName());
	}
	
	@Test
	public void testgetLastName() {
		assertEquals("Mansi",sc.getLastName());
	}

}
