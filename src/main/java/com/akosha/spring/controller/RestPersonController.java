package com.akosha.spring.controller;

import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.akosha.spring.entity.Person;
import com.akosha.spring.service.PersonService;

@RestController
@RequestMapping("/api")
public class RestPersonController 
{
 
	 @Autowired
	 private PersonService personService;
 
	 @RequestMapping(value = "/create",method=RequestMethod.POST)
	 public Person create(@RequestBody Person person)
	 {
		 person.setCreatedAt(new Date().toString());
		 System.out.println(person.getName());
		 personService.save(person);
		 List<Person> list=personService.listPerson();
		 return list.get(list.size()-1);
	 }
	 
	 @RequestMapping(value = "/getAll",method=RequestMethod.GET)
	 public List<Person> getAll()
	 {
		 return personService.listPerson();
	 }
	 
	 @RequestMapping(value = "/getSelected/{name}",method=RequestMethod.GET)
	 public List<Person> getSelected(@PathVariable("name") String name)
	 {
		 System.out.println("Chete");
		 System.out.println("See:"+name);
		 return personService.getSelectedPerson(name);
	 }

// @RequestMapping(method=RequestMethod.GET)
// public List<Hotel> list() {
//  return this.hotelRepository.findAll();
// }
//
// @RequestMapping(value="/{id}", method=RequestMethod.GET)
// public Hotel get(@PathVariable("id") long id) {
//  return this.hotelRepository.findOne(id);
// }
// 
// @RequestMapping(value="/{id}", method=RequestMethod.PUT)
// public Hotel update(@PathVariable("id") long id, @RequestBody @Valid Hotel hotel) {
//  return hotelRepository.save(hotel);
// }
// 
// @RequestMapping(value="/{id}", method=RequestMethod.DELETE)
// public ResponseEntity<Boolean> delete(@PathVariable("id") long id) {
//  this.hotelRepository.delete(id);
//  return new ResponseEntity<Boolean>(Boolean.TRUE, HttpStatus.OK);
// }
}