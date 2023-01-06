package com.itcademy.jpademo.dao.impl;

import com.itcademy.jpademo.dao.DAO;
import com.itcademy.jpademo.entity.Teacher;

public class TeacherDAOImpl extends GeneralDAO<Teacher> implements DAO<Teacher>{

	@Override
	public Teacher create(Teacher teacher) {
		return super.create(teacher);
	}

	@Override
	public Teacher read(Class<Teacher> classType, int id) {
		
		return super.read(classType, id);
	}

	@Override
	public Teacher update(Teacher t) {
		
		return super.update(t);
	}

	@Override
	public boolean delete(Class<Teacher> classType, int id) {
		
		return super.delete(classType, id);
	}

	
	
}
