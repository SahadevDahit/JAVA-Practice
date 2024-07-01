package oop;

public class basicFunc {
	  static int sum(int num) {
			if(num<1) {
				return 0;
			}else {			
				return (num*(num+1)/2);
			}
			
		}
	  
	  static boolean isPrime(int num) {
		  if(num<1) {
			  return false;
		  }else {
			  int count=0;
			  for(int i=2;i<num/2;i++) {
				 if(num%i==0) {
					 count++;
				 }
			  }
			  if(count>1) {
				  return false;
			  }else {
				  return true;
			  }
			  
		  }
	  }

	  static int fact(int num) {
		  if(num==1) {
			  return 1;
		  }
		  return num*fact(num-1);
	  }
	  
	  
	  
	   static void primeToN(int num) {
		  for(int i=1;i<=num;i++) {
			  boolean isPrime=isPrime(i);
			  if(isPrime) {
				  System.out.println(i);
			  }
		  }
		 	 
	  }

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// Print the sum upto N
//		 System.out.println(sum(5));
		 
		 // check whether the number is prime or not
//		 System.out.println(isPrime(18));
		 
		 // print all the prime number from 0 to N
//		 primeToN(20);
		 
		 // factorial of any number
		 System.out.println("The factorial of the given number is "+fact(5));
	}

}
