package oop;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.stream.Collectors;

class OuterClass{
	int x=10;
	class InnerClass{
		int y=15;
	}
}

//Inner classes can access private members of the outer class. 
//This allows better encapsulation and hides the implementation details from the outside world.
//Inner classes can be used to implement helper classes that are used only within the outer class.
public class hello_world {
	
	public static void main(String[] args) {	
	
		OuterClass outerObj=new OuterClass();
		OuterClass.InnerClass innerObj= outerObj.new InnerClass();
		System.out.println(outerObj.x+innerObj.y);
		
	}
}
