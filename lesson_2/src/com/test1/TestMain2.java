package com.test1;

public class TestMain2 {

	public static void main(String[] args) {
		
		Person p = new Teacher();
		
		p.eat();
		p.study();
		
		Teacher t1 = (Teacher) p;
		t1.teach();
	}
}
