package com.test4;

public class TestMain3 {
	public static void main(String[] args) {
		
		String sql = "  select empno, ename, job, sal, comm " ;
		sql = sql + "  from  " +  "  emp t1  " + "where 1 = 1";
		long s1 = System.currentTimeMillis();
		String sql1 = "";
		for (int i = 0; i < 10000; i++) {
			sql1 = sql1 + "a";
		}
		long s2 = System.currentTimeMillis();
		System.out.println(s2 - s1);
	
		s1 = System.currentTimeMillis();
		StringBuilder sql2 = new StringBuilder();
		for (int i = 0; i < 10000; i++) {
			sql2.append("a");
		}
		s2 = System.currentTimeMillis();
		System.out.println(s2 - s1);
		
	}

}
