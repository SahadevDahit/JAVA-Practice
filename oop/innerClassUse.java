package oop;

class Parent{
	private int age=33;
	class child{
		public void display() {
			System.out.println("Age of the parents "+age);
		}
	}
}
public class innerClassUse {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Parent p1=new Parent();
		Parent.child obj=p1.new child();
		obj.display();
	}

}
