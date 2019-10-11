package com.test1;

public class TestMain3 {
	public static void main(String[] args) {
		
		Dog d = new Hashiqi();
		
		A a = new A();
		a.setD(d);
		a.liugou();
		
		a.setD(new Bomei());
		a.liugou();
	}
	public Dog aaa() {
		return new Bomei();
	}
}
