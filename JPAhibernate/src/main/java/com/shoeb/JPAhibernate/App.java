package com.shoeb.JPAhibernate;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
    	Students st=new Students();
    	st.setID(101);
    	st.setName("SHoeb");
    	st.setGender("Male");
    		
    		EntityManagerFactory emf=Persistence.createEntityManagerFactory("pu");
    		EntityManager em=emf.createEntityManager();
    	
    		em.getTransaction().begin();
    		//to save or persist;but before this we have to start the Transaction and then commit it.
    		em.persist(st);
    		em.getTransaction().commit();
    		Students s =em.find(Students.class,101);
    	 	System.out.println(s);
    	 	
    	 	
    		

    }
}
