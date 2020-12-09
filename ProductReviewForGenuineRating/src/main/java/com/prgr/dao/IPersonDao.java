package com.prgr.dao;

import java.util.List;

import com.prgr.model.Person;

public interface IPersonDao {
	public Person addPerson(Person person);
	 public int updatePerson(Person person);
	 public List<Person> viewAllPerson();

}
