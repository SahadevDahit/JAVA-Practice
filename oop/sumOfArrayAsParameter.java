package oop;

public class sumOfArrayAsParameter {
	public static int sum(int[] num) {
		int s=0;
		for(int i=0;i<num.length;i++) {
			s+=num[i];
		}
		
		return  s;		
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[] nums= {1,2,3,4};
		int sd=sum(nums);
		System.out.printf("The sum of the array elements is %d",sd);
	}

}
