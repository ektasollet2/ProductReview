package com.prgr.service;

import java.util.List;

import com.prgr.model.Person;

public interface PersonService {
	public Person addPerson(Person person);
	 public Person updatePerson(Person person);
	 public List<Person> viewAllPerson();
}
