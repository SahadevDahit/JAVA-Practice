package oop;

import java.util.LinkedList;

public class linkedList {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		  LinkedList<String> cars = new LinkedList<String>();
		  cars.add("Volvo");
		  cars.add("Bullet");
		  cars.add("Rolls Royals");
		  
		  for(String car: cars){
			  System.out.println(car);
		  }

	}

}
