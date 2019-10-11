package com.test3;

import java.lang.reflect.Field;

public class TestMain2 {

	public static void main(String[] args) throws IllegalArgumentException, IllegalAccessException {

		Person p1 = new Person("Tom", 1111);
		
		checkAnnotation(p1);
		
	}

	private static void checkAnnotation(Person p1) throws IllegalArgumentException, IllegalAccessException {
		System.out.println("=====================");
		Class clazz = p1.getClass();
		System.out.println(clazz);
		System.out.println("=====================");
		Field[] fs = clazz.getDeclaredFields();
		for (Field temp : fs) {
			System.out.println(temp);
			System.out.println("$$$$$$$$$$$$$$$$$$$$");
			CheckAge can = temp.getAnnotation(CheckAge.class);
			if (can != null) {
				int i = can.min();
				int j = can.max();
				String msg = can.msg();
				temp.setAccessible(true);
				Object o = temp.get(p1);
				System.out.println("^^^^^^^^^^^^^^^^^^");
				System.out.println(o);
				int age = Integer.parseInt(o.toString());
				System.out.println(age);
				System.out.println("^^^^^^^^^^^^^^^^^^");
				
				System.out.println(o.toString());
				if (age < i || age > j) {
					System.out.println(msg);
				}
			}
		}
	}

}
