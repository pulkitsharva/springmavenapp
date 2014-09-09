package com.akosha.spring.controller;

import java.util.Date;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
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
		 return personService.getParticularPerson(2);
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