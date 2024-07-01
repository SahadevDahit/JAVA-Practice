package oop;

import java.util.ArrayDeque;

public class ArrayDequeImpl {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayDeque<Integer> stack = new ArrayDeque<>();
		// Add elements in the stack (FIFO)
		stack.push(23);
		stack.push(93);
		stack.push(54);
		stack.push(76);
		stack.push(90);
		stack.push(41);
		
		// Remove Elements from stack
		System.out.println(stack.pop());
		System.out.println(stack.pop());
		
		// Now the queue implementation FIFO
		ArrayDeque<String> queue=new ArrayDeque<>();
		queue.offer("john");
		queue.offer("Antony");
		queue.offer("Sara");
		queue.offer("Ali");
		System.out.println(queue.remove());
				
	}
}
