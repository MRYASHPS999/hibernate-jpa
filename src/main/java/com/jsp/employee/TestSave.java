package com.jsp.employee;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

public class TestSave {
	
	public static void main(String[] args) {
		
		EntityManagerFactory entityManagerFactory= Persistence.createEntityManagerFactory("yash"); //passing persistence unit name
		
		EntityManager entityManager=entityManagerFactory.createEntityManager();

		EntityTransaction entityTransaction=entityManager.getTransaction();
		
		//employee entity object
		Employee employee=new Employee();
		
		//employee.setId(2);
		
		employee.setName("abcd1");
		employee.setEmail("abcd1@mail.com");
		employee.setCno(1234565891);
		
		entityTransaction.begin();
		
		entityManager.persist(employee);
		
		entityTransaction.commit();
		
	}

}
