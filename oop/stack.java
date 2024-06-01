package oop;

import java.util.ArrayDeque;

public class stack {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayDeque<Integer> stack=new ArrayDeque<>();
		stack.push(12);
		stack.push(19);
		stack.push(29);
		stack.push(38);
		stack.push(54);
		stack.push(87);
		
		System.out.println(stack);
		stack.pop();
		System.out.println(stack);
	}

}
