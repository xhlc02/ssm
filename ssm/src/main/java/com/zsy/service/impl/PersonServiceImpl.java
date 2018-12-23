package com.zsy.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.zsy.dao.PersonDao;
import com.zsy.entity.Person;
import com.zsy.service.PersonService;

@Service
public class PersonServiceImpl implements PersonService {
	@Autowired
	private PersonDao personDao;
	@Override
	public List<Person> selectPerson() {
		// TODO Auto-generated method stub
		return personDao.selectPerson();
	}

}
