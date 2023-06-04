package com.example.demo.util;

import java.util.Arrays;
import java.util.HashMap;

public class Test1 {

	
	//empty container
	String[] strings = new String[5];

	public Test1(String[] strings) {
		super();
		this.strings = strings;
	}

	/*
	 * public HashMap<String, Integer> count() {
	 * 
	 * HashMap<String, Integer> map = new HashMap<String, Integer>();
	 * 
	 * for (String str : strings) {
	 * 
	 * int count = 0;
	 * 
	 * for (int i = 0; i < str.length(); i++) { count++; }
	 * 
	 * map.put(str, count);
	 * 
	 * }
	 * 
	 * 
	 * System.out.println(map); return map ; }
	 */

	public String[] revere() {

		String[]  reverse   = strings ;
		
		
	   reverse[0]= strings[2] ;
	   reverse[1]= strings[1] ;
	   reverse[2]= strings[0] ;
		
		return reverse;

	}

	public static void main(String[] args) {

		String[] input = { "A", "B" , "C" };

		Test1 t = new Test1(input);
		
		//System.out.println(t.strings);
		
		
		

		System.out.println(Arrays.toString(t.strings));
		
		System.out.println(Arrays.toString(t.revere()));
		
		
		//  HashMap<String,Integer> map = t.count();
		//  System.out.println(map);
		// TODO Auto-generated method stub

	}

}
