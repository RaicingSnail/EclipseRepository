package com.test1;

public abstract class Person {

	public abstract void study();	
	public void eat() {
		System.out.println("Person 类的 eat方法");
	}
	
}
class Teacher extends Person {

	@Override
	public void study() {
		System.out.println("Teacher 类的 study方法");
	}
	
	@Override
	public void eat() {
		System.out.println("Teacher 类的 eat方法");
	}

	public void teach() {
		System.out.println("Teacher 类的 teach方法");
	}
	
}
