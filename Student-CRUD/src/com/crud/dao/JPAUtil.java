package com.crud.dao;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class JPAUtil {
	
		
		private static EntityManagerFactory factory; // entitymanagerFactory is responsible for generating EntityManager
		
	    private static EntityManager entityManager;
	 
	    static
	{
		factory = Persistence.createEntityManagerFactory("JPA-PU");
		}

	     public static EntityManager getEntityManager()
	{
		if(entityManager ==null || !entityManager.isOpen() )
		{
			entityManager = factory.createEntityManager(); // create entity manager
			
		}	
		return entityManager;

	}

}
