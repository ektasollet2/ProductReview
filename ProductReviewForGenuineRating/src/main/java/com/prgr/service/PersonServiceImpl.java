package com.prgr.service;

import java.util.List;

import com.prgr.dao.PersonDaoImpl;
import com.prgr.model.Person;

public class PersonServiceImpl implements IPersonService {
	
	private PersonDaoImpl personDao;
	
	public PersonServiceImpl() {
		personDao =new PersonDaoImpl() ;
	}

	public Person addPerson(Person person) {
		personDao.addPerson(person);
		return person;
	}

	public int updatePerson(Person person) {
		return 0;
	}

	public List<Person> viewAllPerson() {

		return personDao.viewAllPerson();
	}

}
