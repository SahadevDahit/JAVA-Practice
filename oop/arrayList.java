package oop;

import java.util.ArrayList;

public class arrayList {
	public static void main(String[] args) {
		ArrayList<String> cars = new ArrayList<String>();
		cars.add("Volvo");
		cars.add("FMD");
		cars.add("BMW");
		cars.add("Bugati");
		cars.add("Rolls Roylce");
		
		cars.set(2, "Ruffic");

//		for(int i=0; i<cars.size();i++){
//			System.out.println(cars.get(i));
//					
//		}
		
		for(String i: cars) {
			System.out.println(i);
			
		}
	}
	
	
}
