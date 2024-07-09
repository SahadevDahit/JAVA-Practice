package generics;
    // Bounded Type 
    class Sum<T extends Number>{
    	T num;
    	Sum(T num){
    		this.num=num;
    	}
    	
    	// Functional type Generic
    	
    	 public <G> void printArray(G[] array) {
    	        for (G element : array) {
    	            System.out.print(element + " ");
    	        }    	        
    	        System.out.println();    	
         }
    }


public class BoundedGenerics {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 Integer[] intArray = {1, 2, 3, 4, 5};
		 String[] name= {"sahadev","dahit"};
		 
		 Sum s=new Sum(23);
		 s.printArray(name);
		 s.printArray(intArray);
		 
//		 Sum s1=new Sum("hunk"); Compile time error

	}

}
