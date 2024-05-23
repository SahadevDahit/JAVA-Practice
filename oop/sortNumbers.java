package oop;

public class sortNumbers {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] numbers= {23,17,98,04,7,67};
		int n=numbers.length;
		int temp=0;
		for(int j=0;j<n-1;j++) {
			for(int i=0;i<n-j-1;i++) {
				if(numbers[i]>numbers[i+1]) {
					temp=numbers[i];
					numbers[i]=numbers[i+1];
					numbers[i+1]=temp;
				}
			}
		} 
		
		for(int num:numbers) {
			System.out.println(num);
		}
	}

}
