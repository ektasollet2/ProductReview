package com.prgr.service;

import java.util.List;

import com.prgr.dao.PersonDaoImpl;
import com.prgr.model.Person;

public class PersonServiceImpl implements PersonService {
	
	private PersonDaoImpl personDao;
	
	public PersonServiceImpl() {
		personDao =new PersonDaoImpl() ;
	}

	public Person addPerson(Person person) {
		personDao.addPerson(person);
		return person;
	}

	public Person updatePerson(Person person) {
		return personDao.updatePerson(person);
	}

	public List<Person> viewAllPerson() {

		return personDao.viewAllPerson();
	}

}
