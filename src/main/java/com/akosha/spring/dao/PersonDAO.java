package com.akosha.spring.dao;

import java.util.List;

import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.akosha.spring.entity.Person;

@Repository
public class PersonDAO 
{
	@Autowired
	private SessionFactory sessionFactory;

	public Person getParticularPerson(int id)
	{
		Session session = sessionFactory.getCurrentSession();
		session.beginTransaction();
		Person person= null;
		try 
		{	
			person = (Person) session.createQuery("from Person where id="+id+"").list().get(0);
		}
		catch (HibernateException e) 
		{
			e.printStackTrace();
			session.getTransaction().rollback();
		}
		session.getTransaction().commit();
		return person;
	}
	
	public List<Person> listPerson() 
	{
		return sessionFactory.getCurrentSession().createQuery("from Person").list();
	}
	
	public void save(Person person)
	{
		sessionFactory.getCurrentSession().save(person);
	}


	public void updatePersonDetails(int id, String name) 
	{
		Session session = sessionFactory.getCurrentSession();
		session.beginTransaction();
		Person person= null;
		try 
		{	
			person = getParticularPerson(id);
			person.setName(name);
			session.save(person);
		}
		catch (HibernateException e) 
		{
			e.printStackTrace();
			session.getTransaction().rollback();
		}
		session.getTransaction().commit();	
	}
}