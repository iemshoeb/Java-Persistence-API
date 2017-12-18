package com.shoeb.JPAhibernate;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Students {

	@Id
 private int ID ;
 private String Name ;
 private String Gender;
 
public int getID() {
	return ID;
}
public void setID(int iD) {
	ID = iD;
}
public String getName() {
	return Name;
}
public void setName(String name) {
	Name = name;
}
public String getGender() {
	return Gender;
}
public void setGender(String gender) {
	Gender = gender;
	
}
@Override
public String toString() {
	return "Student [ID=" + ID + ", Name=" + Name + ", Gender=" + Gender + "]";
}
 
}
