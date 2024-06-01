package oop;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class rev_String {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String quotes="This is awsome";

		List<String> lsit=Arrays.asList(quotes.split(" "));
		Collections.reverse(lsit);
		String newHas=String.join(" ", lsit);
		System.out.println(newHas);
	}

}
