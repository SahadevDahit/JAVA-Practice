package oop;

import java.util.PriorityQueue;
import java.util.Queue;

public class priorityQueue {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Queue<Integer> pq= new PriorityQueue<>((a,b)->b-a);
		
		pq.add(23);
		pq.add(55);
		pq.add(77);
		pq.add(7);
		pq.add(19);
		pq.add(90);
		pq.add(106);
		pq.poll();
		
		System.out.println(pq);
		
	}

}
