package com.zsy.dao;

import java.util.List;

import com.zsy.entity.Person;
/**
 * 测试ssm搭建
 * @author Administrator
 *
 */
public interface PersonDao {
	public List<Person> selectPerson();
}
