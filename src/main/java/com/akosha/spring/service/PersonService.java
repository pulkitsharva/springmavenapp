package com.akosha.spring.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.akosha.spring.dao.PersonDAO;
import com.akosha.spring.entity.Person;

@Service
public class PersonService 
{
	@Autowired
	private PersonDAO personDAO;
	
	@Transactional
	public Person getParticularPerson(int id)
	{
		return personDAO.getParticularPerson(id);
	}
	
	@Transactional
	public List<Person> listPerson()
	{
		return personDAO.listPerson();
	}
	
	@Transactional
	public List<Person> getSelectedPerson(String name)
	{
		return personDAO.getSelectedPerson(name);
	}
	
	@Transactional
	public void updatePersonDetails(int id, String name)
	{
		personDAO.updatePersonDetails(id, name);
	}
	
	@Transactional
	public void save(Person person)
	{
		personDAO.save(person);
	}

}
