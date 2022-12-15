package org.hitech.service;
import org.hitech.dao.*;
import org.hitech.model.*;

public class Student_Course_Service {
Student_Course_DAO dao =new Student_Course_DAO();
public void addStudentCourseDetails(Student s,Course c) {
	dao.addStudentCourseDetails(s, c);
}
public void getStudentCourseDetails(Student s,Course c) {
	dao.getStudentCourseDetails();
}
}