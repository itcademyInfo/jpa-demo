package com.itcademy.jpademo.dao.impl;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class GeneralDAO<T> {
	
	private static EntityManagerFactory entityManagerFactory;
	
	public GeneralDAO() {
		// TODO Auto-generated constructor stub
	}
	
	static {
		entityManagerFactory = Persistence.createEntityManagerFactory("persistence");
	}
	
	public T create(T t) {
		EntityManager entityManager = entityManagerFactory.createEntityManager();
		
		entityManager.getTransaction().begin();
		entityManager.persist(t);
		entityManager.flush();
		entityManager.getTransaction().commit();
		entityManager.close();
		
		return t;
	}
	
	public T read(Class<T> classType, int id) {
		EntityManager entityManager = entityManagerFactory.createEntityManager();
		
		T t = entityManager.find(classType, id);
		
		if(t == null) {
			entityManager.refresh(t);
		}
		
		entityManager.close();
		return t;
	}
	
	public T update(T t) {
		EntityManager entityManager = entityManagerFactory.createEntityManager();
		
		entityManager.getTransaction().begin();
		entityManager.merge(t);
		entityManager.getTransaction().commit();
		entityManager.close();
		
		return t;
	}
	
	public boolean delete(Class<T> classType, int id) {
		EntityManager entityManager = entityManagerFactory.createEntityManager();
		entityManager.getTransaction().begin();
		
		T t = entityManager.getReference(classType, id);
		
		if(t == null) {
			// exception
			return false;
		}
		
		entityManager.remove(t);
		entityManager.getTransaction().commit();
		entityManager.close();
		return true;
	}
	
}
