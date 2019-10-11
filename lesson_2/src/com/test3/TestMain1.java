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
		// 获取所有的构造器
		Constructor[] cs = a.getConstructors();
		for (Constructor temp : cs) {
			
			System.out.println(temp);
		}
		// 获取 1个参数是字符串类型, 第二个参数是int型的 构造方法
		Constructor c1 = a.getConstructor(new Class[]{String.class, int.class});
		System.out.println(c1);
		// Object o = new Person("Tom", 12);
		Object o = c1.newInstance(new Object[]{"Tom", 12});
		System.out.println(o);
		
		// Declare系列之指的是: 类定义中存在的。 如果继承下来的属性或方法获取不到
		Field f1 = a.getDeclaredField("name");
		System.out.println(f1);
		// 修改访问权限， private 也可以访问了
		f1.setAccessible(true);
		// 修改对象 的属性
		f1.set(o, "Jerry");
		System.out.println(o);
		
		
		Method m1 = a.getDeclaredMethod("setName", new Class[]{String.class});
		// o.setName("Mary");
		m1.invoke(o, new Object[]{"Mary"});
		System.out.println(o);
		
	}

}
