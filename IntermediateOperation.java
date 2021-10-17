package com.thakur.intermediate;

public class IntermediateOperation {
	
	//distinct() 
	public static void distinctEx() {
		String string = "ashasjklc";
		int[] ch = string.chars().distinct().toArray();
		for (int i = 0; i < ch.length; i++) {
			System.out.println(Character.toString(ch[i]));
		}
	}
	
	public static void main(String[] args) {
		distinctEx();
		
	}
}
