package basic.core;

import java.util.Deque;
import java.util.LinkedList;

public class StringTest {
	
	public static void main(String[] args) {

		String str = "abced";
		System.out.println(str.substring(1)+str.charAt(0));
		
		System.out.println(Math.abs(6));
		
		Deque<Integer> deque = new LinkedList<>();	
		deque.add(4);
		deque.add(2);
		deque.add(6);
		deque.add(5);
		
		System.out.println(deque);
		deque.removeFirst();
		deque.add(9);
		System.out.println(deque);
		deque.remove(6);
		System.out.println(deque);
		deque.add(6);
		System.out.println(deque);
		
		
	}
}
