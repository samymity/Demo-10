package com.example.demo.util;




public class Test {

	int a ;
	
	
	public Test(int a) {
		super();
		this.a = a;
	}



	public void fun(int a) {
		
		if(a !=1 &&   a ==2 )
		{
			System.out.println("First");
		}
			
		else if(a ==4)
		{
			System.out.println("Second");
		}
		
		else
		{
			System.out.println("Exit");
		}
	}
	
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		Test t = new Test(2);
		t.fun(2);
		
		
		
	}

}
