package com.itcademy.jpademo.dao;

public interface DAO<T> {

	public T create(T t);
	
	public T read(Class<T> classType, int id);
	
	public T update(T t);
	
	public boolean delete(Class<T> classType, int id);
}
