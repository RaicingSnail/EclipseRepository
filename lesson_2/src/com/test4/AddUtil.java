package com.test4;

public class AddUtil {
	
	public static int add(int i, int j) throws AddException {
		
		if (2147483647 - i < j) {
			throw new AddException("参数值相加结果超过32位范围");
		}
		
		return i + j;
	}
	public static void main(String[] args) {
		try {
			System.out.println("相加开始");
			AddUtil.add(2147483647, 2);
			System.out.println("相加结束");
		} catch (AddException e) { 
			System.out.println(e.getMessage());
			// 打印错误信息在 控制台
			e.printStackTrace();
		} finally {
			System.out.println("这是finally");
		}
	}
	
}
