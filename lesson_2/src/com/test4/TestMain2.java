package com.test4;

import java.util.Date;

public class TestMain2 {

	public static void main(String[] args) {
		try {
			a();
		} catch (AddException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			System.out.println(e.getO());
		}
	}

	private static void a() throws AddException {
		try {
			b();
		} catch (ClassNotFoundException e) {
			throw new AddException("��b��ת����Add��Exception", e, new Date());
		}
	}

	private static void b() throws ClassNotFoundException {
		throw new ClassNotFoundException("b���쳣");
	}
}
