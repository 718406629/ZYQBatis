package org.zyq.entity;

public class Person1 {
 private int number;
 private String name;
 private int age;
 private boolean sex;
public boolean isSex() {
	return sex;
}
public void setSex(boolean sex) {
	this.sex = sex;
}
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
public Person1(int number, String name, int age,boolean sex) {
	
	this.number = number;
	this.name = name;
	this.age = age;
	this.sex=sex;
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
			
			return this.number+"-"+this.name+"-"+this.age+"-性别:"+this.sex;
		}
	
}
