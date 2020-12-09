package com.prgr.service;

import java.util.List;

import com.prgr.model.Person;

public interface IPersonService {
	public Person addPerson(Person person);
	 public int updatePerson(Person person);
	 public List<Person> viewAllPerson();
}
