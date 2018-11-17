package com.pro.test;


public class Test {
	private Test(int a) {}

	public static void main(String[] args) throws ClassNotFoundException, InstantiationException, IllegalAccessException {
		Class cls=Class.forName("com.pro.test.Test");
		Test test=(Test)cls.newInstance();
		System.out.println(test.getClass().getName());
	}

}
