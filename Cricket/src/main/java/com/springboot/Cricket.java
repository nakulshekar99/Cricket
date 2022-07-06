package com.springboot;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class Cricket {
@Id
@GeneratedValue
@Column(name="id")
	private Integer id;
@Column(name="Name")
	private String pname;
@Column(name="Score")
	private int score;
	public Cricket() {
		
	}
	public Cricket(Integer id, String pname, int score) {
		
		this.id = id;
		this.pname = pname;
		this.score = score;
	}
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getPname() {
		return pname;
	}
	public void setPname(String pname) {
		this.pname = pname;
	}
	public int getScore() {
		return score;
	}
	public void setScore(int score) {
		this.score = score;
	}
	@Override
	public String toString() {
		return "Cricket [id=" + id + ", pname=" + pname + ", score=" + score + "]";
	}
	
	
	
}
