package oop;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class arrayIntoHashSet {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		  // Step 2: Create the array
        Integer[] arr = {12, 56, 9, 89, 54};

        // Step 3: Convert the array to HashSet directly
        Set<Integer> hashSet = new HashSet<>(Arrays.asList(arr));

        // Print the HashSet to verify the conversion
        System.out.println(hashSet);
	}

}
