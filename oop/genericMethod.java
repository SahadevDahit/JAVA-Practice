package oop;

import java.util.ArrayList;
import java.util.Arrays;

 class Box<T>{
	 private T content;
	 
	  public void setContent(T content) {
	        this.content = content;
	    }

	    public T getContent() {
	        return content;
	    }	
}
 

 

public class genericMethod {

	public static <T> T display(T content) {
		return content;
	}
	
	public static <T> void printArray(T[] array) {
        for (T element : array) {
            System.out.print(element + " ");
        }
        System.out.println();
    }
	
	
	
	public static void main(String[] args) {	
				
		Box<String> mybox1=new Box<>();
		mybox1.setContent("Awsome !!!");
		System.out.println(mybox1.getContent());
		
		Box<Integer> mybox2=new Box<Integer>();
		mybox2.setContent(169);
		System.out.println(mybox2.getContent());
		
		System.out.println(display("sahadev dahit"));
		
		
		// passing the array
		 Integer[] intArray = {1, 2, 3, 4, 5};
	     String[] stringArray = {"Hello", "World"};
	     ArrayList<Integer> ssd=new ArrayList<Integer>(Arrays.asList(23,12));
	     	    
//	     printArray(intArray);
//	     printArray(stringArray);
	}

}
