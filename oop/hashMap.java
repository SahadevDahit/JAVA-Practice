package oop;

import java.util.HashMap;
import java.util.HashSet;

public class hashMap {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HashMap<String, String> capitalCities=new HashMap<String, String>();
		capitalCities.put("Nepal","kathmandu");
		capitalCities.put("India","New Delhi");
		capitalCities.put("America","Wasing ton dc");
		capitalCities.put("China","Beijing");
		capitalCities.put("America","Beijing");
//		System.out.println(capitalCities.get("China"));
		
		// Hash set 
		 HashSet<String> cars = new HashSet<String>();
		    cars.add("Volvo");
		    cars.add("BMW");
		    cars.add("Ford");
		    cars.add("BMW");
		    cars.add("Mazda");
		    cars.add("Mazda");
		    cars.add("BMW");
		    System.out.println(cars);
		    
		   

	}

}
