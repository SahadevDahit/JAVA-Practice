package oop;

import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public class Frequency_Occurance {

	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String text="This is awsome";
		HashSet occurance=new HashSet<>();
		
		for(int i=0;i<text.length();i++) {
			System.out.println("--->"+text.charAt(i));
			if(occurance.contains(text.charAt(i))) {
				
			}
		}

	}

}
