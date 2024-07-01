package oop;

public class datatypes {

	public static void main(String[] args) {
		
//		boolean 1 bit
//		char short 2 byte
//		float int 4 bytes
//		long double 8 bytes 
		
		
		// TODO Auto-generated method stub
		   byte b1=-128;
		  System.out.println("Byte Data Types Range");
		  System.out.println("------------------------------------");
  		  System.out.println("Min value "+Byte.MIN_VALUE);
  		  System.out.println("Max value "+Byte.MAX_VALUE);
  		  System.out.println("------------------------------------");
  		  
  		  short short1=32767;
		  System.out.println("Short Types Range");
		  System.out.println("------------------------------------");
  		  System.out.println("Min value "+Short.MIN_VALUE);
  		  System.out.println("Max value "+Short.MAX_VALUE);
  		  System.out.println("------------------------------------");
		   
		   int int1=-127;
			  System.out.println("Integer Data Types Range");
			  System.out.println("------------------------------------");
	  		  System.out.println("Min value "+Integer.MIN_VALUE);
	  		  System.out.println("Max value "+Integer.MAX_VALUE);
	  		  System.out.println("------------------------------------");
		
		  long long1=-9223372036854775808L | 9223372036854775807L;
		  System.out.println("Long Data Types Range");
		  System.out.println("------------------------------------");
  		  System.out.println("Min value "+Long.MIN_VALUE);
  		  System.out.println("Max value "+Long.MAX_VALUE);
  		  System.out.println("------------------------------------");
		
		  double double1=-9223372036854775808L | 9223372036854775807L;
	      System.out.println("Double Data Types Range");
	      System.out.println("------------------------------------");
	      System.out.println("Min value "+Double.MIN_VALUE);
	      System.out.println("Max value "+Double.MAX_VALUE);
	      System.out.println("------------------------------------");
		
		// If we want to convert from the lower range data into the higher range then we can do 
		// it implicitly. But if we want from the higher to lower then we need to do it explicitly
		// widening conversion is also known as the implicit casting
		
		
		int a=23;
		float b=34.5f;
		int c=(int) b; // explicit casting
		
		long sd=c;   // widening casting from int to long
		
		long l=345l; 
		b=(float) l;  // narrowing conversion from long to float
		
		double d1=3E5;
		long ll=(long)d1;
//		System.out.println(ll);
		
		
		System.out.println(Integer.toBinaryString(-1));
		
		
	}
}
