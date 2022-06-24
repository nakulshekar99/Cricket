package com.springboot.University;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;


@RestController
public class Unicontroller {
	@Autowired
	private Uniservice service;
	@RequestMapping(method=RequestMethod.POST,value="/create")
	public MessageRespond create(@RequestBody University university)
	{
		return service.create(university);
	}
	@RequestMapping(method=RequestMethod.GET,value="/all")
	public ResponseEntity<List<University>> getAllUni()
	{
		List<University>uni=service.getAll();
		return new ResponseEntity<>(uni,HttpStatus.OK);
	}
	@RequestMapping(method=RequestMethod.GET,value="/university/{id}")
	public ResponseEntity<University>getUniversitybyId(@PathVariable("id")Integer id)
	{
		University univer= service.single(id);
		return new ResponseEntity<>(univer,HttpStatus.OK);
	}
	
}
