package com.example.demo.util;

import java.util.Arrays;
import java.util.HashMap;

public class ArrayReverse {

	
	//empty container
	String[] strings = new String[5];


	//Constructor
	public ArrayReverse(String[] strings) {
		
		this.strings = strings;
	}

	

	//operation1
	public String[] revere() {

		String[]  reverse   =  new String[strings.length];
		
		
		for( int i =0; i<strings.length ; i++)
	 
		reverse[i]= strings[strings.length-1-i] ;
	 //  reverse[1]= strings[1] ;
	 //  reverse[2]= strings[0] ;
		
		return reverse;

	}

	//psvm
	public static void main(String[] args) {

		
		//input
		String[] input = { "A","B","C" , "D" , "E"};
		ArrayReverse t = new ArrayReverse(input);
		
		
		
	//Operation	
System.out.println(Arrays.toString(t.strings));
System.out.println(Arrays.toString(t.revere()));
		
		
	
	}

}
