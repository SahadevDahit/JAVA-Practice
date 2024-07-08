package dsa.linkedList;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		LL ll=new LL();
		DLL ll=new DLL();
	
		ll.insertFirst(23);
		ll.insertFirst(54);
		ll.insertFirst(87);
		ll.insertFirst(12);
//		ll.insertFirst(43);
//		
		ll.insertLast(54);
		ll.insertLast(43);
//		ll.insertLast(89);
//		ll.insertLast(27);
//		ll.insertLast(9);
		
//		ll.insertBetween(23, 5);
//		System.out.println(ll.search(276));
//		int item=ll.getItem(22);
//		System.out.println("Item -->"+item);
		ll.display();
	}

}
