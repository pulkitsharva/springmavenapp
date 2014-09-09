package com.akosha.spring.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import com.akosha.spring.dao.PersonDAO;
import com.akosha.spring.entity.Person;

public class PersonService 
{
	@Autowired
	PersonDAO personDAO;
	
	public Person getParticularPerson(int id)
	{
		return personDAO.getParticularPerson(id);
	}
	
	public List<Person> listPerson()
	{
		return personDAO.listPerson();
	}
	
	public void updatePersonDetails(int id, String name)
	{
		personDAO.updatePersonDetails(id, name);
	}
	
	public void save(Person person)
	{
		personDAO.save(person);
	}

}
