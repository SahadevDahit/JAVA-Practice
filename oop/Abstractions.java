package oop;

interface Math{
	int score=87;
  void getScore();	
  public static void test() {
	  System.out.println("This is from the test function");
  }
   void getChapter();
  static void sd() {
	  System.out.println("This is from the static methods of the math");
  }
  default void display() {
	  System.out.println("Default from the Math interface");
  }
}

abstract class Animal{
	Animal(){}
	
	protected String name="Animal";
	abstract public void sound();
	
	public void feature() {
		System.out.println("God's creation is easy");
	}
	
}


// Difference between interface and abstract
//--------------------------------------------------------------------
//1. interface does not support access modifier like protected,private but it's supported in abstract
//2. interface supports the default methods but abstract does not support the default methods
//3. We can create the constructor of the abstract class although can't be instantiated but not in the interface
//4. abstract methods have the body but interface methods cannot have body except static and default
class Dog extends Animal{

	@Override
	public void sound() {
		// TODO Auto-generated method stub
		System.out.println("Dog barks like bow bow !!! "+name);
	}
	
}

class Cat extends Animal{

	@Override
	public void sound() {
		// TODO Auto-generated method stub
		System.out.println("Sounds like a meow meow");
	}
	
}

public class Abstractions {

	public static void main(String[] args) {
	Dog dog1=new Dog();
    dog1.sound();
    
    Cat cat1=new Cat();
    cat1.sound();
   
	}

}
