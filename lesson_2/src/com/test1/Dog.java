package com.test1;

public class Dog {

	public void saniao(){
		System.out.println("��������");
	}
}
class Hashiqi extends Dog {

	@Override
	public void saniao() {
		System.out.println("hashiqi��������");
	}
}
class Bomei extends Dog{

	@Override
	public void saniao() {
		System.out.println("bomei��������");
	}
	
}