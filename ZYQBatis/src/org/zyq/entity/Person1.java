package org.zyq.entity;

public class Person1 {
 private int number;
 private String name;
 private int age;
public int getNumber() {
	return number;
}
public void setNumber(int number) {
	this.number = number;
}
public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
public int getAge() {
	return age;
}
public void setAge(int age) {
	this.age = age;
}
public Person1(int number, String name, int age) {
	
	this.number = number;
	this.name = name;
	this.age = age;
}
public Person1() {
	
}
	@Override
		public String toString() {
			
			return this.number+"-"+this.name+"-"+this.age;
		}
	
}
