package com.itcademy.jpademo;

import com.itcademy.jpademo.dao.impl.TeacherDAOImpl;
import com.itcademy.jpademo.entity.Teacher;

public class Main {

	public static void main(String[] args) {
		
		//Teacher teacher = new Teacher("Mr. Boss");

		TeacherDAOImpl teacherDAO = new TeacherDAOImpl();
		
		
		//teacherDAO.create(teacher);
		System.out.println(teacherDAO.delete(Teacher.class, 1));
	}

}
