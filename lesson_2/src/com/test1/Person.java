package com.test1;

public abstract class Person {

	public abstract void study();	
	public void eat() {
		System.out.println("Person ��� eat����");
	}
	
}
class Teacher extends Person {

	@Override
	public void study() {
		System.out.println("Teacher ��� study����");
	}
	
	@Override
	public void eat() {
		System.out.println("Teacher ��� eat����");
	}

	public void teach() {
		System.out.println("Teacher ��� teach����");
	}
	
}
