package com.springboot;

import java.util.Comparator;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
@Component
public class Service {
	@Autowired
private	PlayerRepository repo;
	public MessageResponse create(Cricket playerRequest)
	{
		
		playerRequest.setId(playerRequest.getId());
		playerRequest.setPname(playerRequest.getPname());
		playerRequest.setScore(playerRequest.getScore());
		repo.save(playerRequest);
		return new MessageResponse("Player created");
	}
	public Cricket single(Integer id)
	{
		return repo.findById(id).get();
	}
	public List<Cricket> getAll()
	{
		List<Cricket>list=repo.findAll();
		 list.sort(Comparator.comparing(Cricket::getPname));
		 return list;
}
}