package com.test4;

public class AddUtil {
	
	public static int add(int i, int j) throws AddException {
		
		if (2147483647 - i < j) {
			throw new AddException("����ֵ��ӽ������32λ��Χ");
		}
		
		return i + j;
	}
	public static void main(String[] args) {
		try {
			System.out.println("��ӿ�ʼ");
			AddUtil.add(2147483647, 2);
			System.out.println("��ӽ���");
		} catch (AddException e) { 
			System.out.println(e.getMessage());
			// ��ӡ������Ϣ�� ����̨
			e.printStackTrace();
		} finally {
			System.out.println("����finally");
		}
	}
	
}
