package com.example.demo.util;

import java.util.Arrays;
import java.util.HashMap;

public class ArrayRemoveDuplicates {

	
	//empty container
	String[] strings = new String[5];


	//Constructor
	public ArrayRemoveDuplicates(String[] strings) {
		
		this.strings = strings;
	}

	

	//operation1
	public String[] removeDuplicates() {

		String[]  duplicate   =  new String[strings.length];
		
	      duplicate =  strings;
	      
	      if ( strings[0] == strings[1]  )
	
	    	 duplicate[0] = null; 
	      else if( strings[1] == strings[2]  )
	    	  duplicate[1] = null; 
	    	
		
		/*
		 * for( int i =0; i<strings.length ; i++) {
		 * 
		 * 
		 * if (strings[0] == strings[1])
		 * 
		 * 
		 * duplicate[i]= strings[strings.length-1-i] ;
		 * 
		 * }
		 */
		
		//duplicate[1] = null;
		return duplicate;

	}

	//psvm
	public static void main(String[] args) {

		
		//input
		String[] input = { "A","A","C"};
		ArrayRemoveDuplicates t = new ArrayRemoveDuplicates(input);
		
		
		
	//Operation	
System.out.println(Arrays.toString(t.strings));
System.out.println(Arrays.toString(t.removeDuplicates()));
		
		
	
	}

}
