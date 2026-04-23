package com.ait.collectionEnhancement;

import java.util.Optional;

public class OptionalClass {

	public static Optional<String> display( String i) {
		Optional<String> optional = Optional.ofNullable(i);
		return optional;

	}
	
	public static void main(String[] args) {
       Optional<String> s = display("Hi");    
		System.out.println(s.isPresent());
       if(s.isPresent()) {
    	   System.out.println(s.get());
       System.out.println("Not null");
       }else {
    	   System.out.println("null");
       }
	}



}
