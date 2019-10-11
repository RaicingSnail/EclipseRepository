package com.test3;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public class TestMain1 {

	public static void main(String[] args) throws ClassNotFoundException, NoSuchMethodException, SecurityException, InstantiationException, IllegalAccessException, IllegalArgumentException, InvocationTargetException, NoSuchFieldException {
		Class a = Person.class;
//		Person p = new Person();
//		Class b = p.getClass();
//		Class c = Class.forName("com.test3.Person");
		// ��ȡ���еĹ�����
		Constructor[] cs = a.getConstructors();
		for (Constructor temp : cs) {
			
			System.out.println(temp);
		}
		// ��ȡ 1���������ַ�������, �ڶ���������int�͵� ���췽��
		Constructor c1 = a.getConstructor(new Class[]{String.class, int.class});
		System.out.println(c1);
		// Object o = new Person("Tom", 12);
		Object o = c1.newInstance(new Object[]{"Tom", 12});
		System.out.println(o);
		
		// Declareϵ��ָ֮����: �ඨ���д��ڵġ� ����̳����������Ի򷽷���ȡ����
		Field f1 = a.getDeclaredField("name");
		System.out.println(f1);
		// �޸ķ���Ȩ�ޣ� private Ҳ���Է�����
		f1.setAccessible(true);
		// �޸Ķ��� ������
		f1.set(o, "Jerry");
		System.out.println(o);
		
		
		Method m1 = a.getDeclaredMethod("setName", new Class[]{String.class});
		// o.setName("Mary");
		m1.invoke(o, new Object[]{"Mary"});
		System.out.println(o);
		
	}

}
