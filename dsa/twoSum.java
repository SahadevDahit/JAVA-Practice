package dsa;

import java.util.HashMap;

public class twoSum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// [2,4,7,9] target-> 11
				int[] array= {2,4,7,9};
				int  target=16;
				HashMap<Integer,Integer> hashset=new HashMap<>(); 
				for(int i=0; i<array.length;i++) {
					if(hashset.containsKey(target-array[i])) {
						System.out.println(hashset.get(target-array[i])+"  "+i);
						return;
					}else {
						hashset.put(array[i],i);
					}
				}}

}
