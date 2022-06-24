package com.springboot.University;

import java.util.Comparator;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;


@Component
public class Uniservice {
	@Autowired
private Unirepository repo;
	public MessageRespond create(University university)
	{
		university.setId(university.getId());
		university.setName(university.getName());
		university.setTotalnum(university.getTotalnum());
		repo.save(university);
		return new MessageRespond("University created successfully!");
	}
	public List<University> getAll()
	{
		return repo.findAll();
		 
		 
		
	}
	public University single(Integer id)
	{
		return repo.findById(id).get();
	}
}
