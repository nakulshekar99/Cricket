package com.springboot.University;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
@Entity
public class University {
@Id
@GeneratedValue
@Column(name="id")
private Integer id;
@Column(name="University_name")
private String name;
@Column(name="Total_college")
private int totalnum;
public University() {
	super();
}
public University(Integer id, String name, int totalnum) {
	super();
	this.id = id;
	this.name = name;
	this.totalnum = totalnum;
}
public Integer getId() {
	return id;
}
public void setId(Integer id) {
	this.id = id;
}
public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
public int getTotalnum() {
	return totalnum;
}
public void setTotalnum(int totalnum) {
	this.totalnum = totalnum;
}
@Override
public String toString() {
	return "University [id=" + id + ", name=" + name + ", totalnum=" + totalnum + "]";
}

	
}
