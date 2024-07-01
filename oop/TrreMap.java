package oop;

import java.util.HashMap;
import java.util.TreeMap;

public class TrreMap {

	public static void main(String[] args) {
		// sort the hashMap using the Tree Set
		HashMap<Character,Integer> occurance=new HashMap<Character,Integer>();
		occurance.put('u', 5);
		occurance.put('e', 3);
		occurance.put('i', 4);
		occurance.put('o', 2);
		occurance.put('a', 3);
		
		occurance.put('a', occurance.get('a')+5);
		occurance.put('o', occurance.get('o')+5);
		occurance.put('i', occurance.get('i')+5);
		
		TreeMap<Character,Integer> sortedMap= new TreeMap<Character,Integer>(occurance);

		
		for(Character key:sortedMap.keySet()) {
			System.out.println("The occurance of "+key+" is "+sortedMap.get(key) );
			
		}
	}

}
