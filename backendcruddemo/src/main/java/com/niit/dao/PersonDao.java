package com.niit.dao;

import java.util.List;



import com.niit.model.Person;

public interface PersonDao {
	List<Person> getAllPersons();
	void savePerson (Person person);
	Person getPerson(int id);
	void deletePerson(int id);
	Person updatePerson(Person person);

}
