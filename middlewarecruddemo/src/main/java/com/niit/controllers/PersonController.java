package com.niit.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.niit.dao.PersonDao;
import com.niit.model.ErrorClazz;
import com.niit.model.Person;

@Controller

public class PersonController {
	public PersonController(){
		System.out.println("PersonController bean is created");
	}
	@Autowired
	private PersonDao personDao;
	@RequestMapping(value="/persons",method=RequestMethod.GET)
	public ResponseEntity <List<Person>> getAllPersons()
	{
		List<Person> persons=personDao.getAllPersons();
		return new ResponseEntity<List<Person>>(persons,HttpStatus.OK);
	}
	@RequestMapping(value="/addperson",method=RequestMethod.POST)
public ResponseEntity <?> savePerson(@RequestBody Person person)
{
		if(person.getFirstname()==null ||person.getFirstname().equals(""))
		{
			ErrorClazz errorClazz=new ErrorClazz(1,"Firstname cannot be null");
			return new ResponseEntity<ErrorClazz>(errorClazz,HttpStatus.INTERNAL_SERVER_ERROR);
		}
		try{
			personDao.savePerson(person);
		}
		catch(Exception e)
		{
			ErrorClazz errorClazz=new ErrorClazz(2,"Email already exists");
			return new ResponseEntity<ErrorClazz>(errorClazz,HttpStatus.INTERNAL_SERVER_ERROR);
		}
		return new ResponseEntity<Person>(person, HttpStatus.CREATED);
}
	@RequestMapping(value="/getperson/{id}",method=RequestMethod.GET)
	public ResponseEntity<?> getPerson(@PathVariable int id)
	{
		Person person=personDao.getPerson(id);
		if(person==null)
		{
			ErrorClazz errorClazz=new ErrorClazz(3,"Person with"+id+"not found");
			return new ResponseEntity<ErrorClazz>(errorClazz,HttpStatus.NOT_FOUND);
			
		}
		return new ResponseEntity<Person>(person,HttpStatus.OK);
	}
	@RequestMapping(value="/deleteperson",method=RequestMethod.DELETE)
	public ResponseEntity<?>deletePerson(@RequestParam int id)
	{
		try{
		personDao.deletePerson(id);
		}
		catch(Exception e)
		{
			ErrorClazz errorClazz=new ErrorClazz("unable to delete person details...");
			return new ResponseEntity<ErrorClazz>(errorClazz,HttpStatus.INTERNAL_SERVER_ERROR);
		}
		return new ResponseEntity<Void>(HttpStatus.OK);
	}
	@RequestMapping(value="/updateperson",method=RequestMethod.PUT)
	public ResponseEntity<?>updatePerson(@RequestBody Person person)
	{
		try{
		personDao.updatePerson(person);
		}
		catch(Exception e)
		{
			ErrorClazz errorClazz=new ErrorClazz(5,"Unable to update person details");
			return new ResponseEntity<ErrorClazz>(errorClazz,HttpStatus.INTERNAL_SERVER_ERROR);
		}
		return new ResponseEntity<Person>(person,HttpStatus.OK);
		
	}
	
	
	
	
	
	
	
	
	
}
