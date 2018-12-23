package com.zsy.controller;

import java.util.List;

import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.zsy.entity.Person;
import com.zsy.service.PersonService;
/**
 * 测试ssm搭建
 * @author Administrator
 *
 */
@Controller
@RequestMapping("/person")
public class PersonController {
	@Autowired
	private PersonService personService;
	@RequestMapping("/list")
	public String selectPerson(HttpServletRequest request){
		List<Person> list = personService.selectPerson();
		System.out.println(list);
		request.setAttribute("list", list);
		return "list";
	}
}
