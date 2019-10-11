package com.test1;

public class Dog {

	public void saniao(){
		System.out.println("¹·ÔÚÈöÄò");
	}
}
class Hashiqi extends Dog {

	@Override
	public void saniao() {
		System.out.println("hashiqi¹·ÔÚÈöÄò");
	}
}
class Bomei extends Dog{

	@Override
	public void saniao() {
		System.out.println("bomei¹·ÔÚÈöÄò");
	}
	
}