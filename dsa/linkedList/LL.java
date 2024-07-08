package dsa.linkedList;

public class LL {
	private Node head;
	private Node tail;
	private int size;
	
	public LL(){
		this.size=0;
	}

	public class Node{
		
		private Node next;
		private int value;
		public Node(int value) {
			this.value=value;
		}
		
		public Node(int value,Node next) {
			this.value=value;
			this.next=next;
		}
	}
	public void insertFirst(int value) {
		Node node=new Node(value);
		node.next=head;
		head=node;
		if(tail==null) {
			tail=node;
		}
		size+=1;
	}
	
	public void insertLast(int value) {
		Node node = new Node(value);
		if(head==null) {
			this.head=node;
			this.tail=node;
			size+=1;
			return;
		}
		Node current=head;
		while(current!=null) {
			current=current.next;
		}
		tail.next=node;
		tail=node;
		size+=1;
	}
	
	public void insertBetween(int value,int position) {
		// case 1 : position is greater than size
		// case 2 : when the list is empty
		// case 3 : when the positon is at the end of the list
		// case 4 : else case
		
		// case 1
		if(position>this.size) {
			System.out.println("Index out of bound");
			return;
		}
		
		Node node=new Node(value);
		// case 2 when the list is empty
		if(head==null) {
			head=node;
			tail=node;
			return;
		}
		
		// case 3 when the position at the end
		if(position==this.size) {
			tail.next=node;
			tail=node;
			size+=1;
			return;
			
	}
		
		// else case
		Node current=head;
		int i=0;
		while(current!=null ) {
			current=current.next;  // 0 1 2 3 4 
			if(i==position-2)	{
				Node temp=current.next;
				node.next=temp;
				current.next=node;	
				
				return;
			}
			i++;
			size+=1;
		}
		
		
	}
	
	public boolean search(int element) {
		if(head==null) {
			return false;
		}
		Node current=head;
		while(current!=null) {
			if(current.value==element) {
				return true;
			}
			current=current.next;
		}
		return false;
	}

	public int getItem(int index) {
		
		if(index>this.size) {
			System.out.println("index out of bound");
			return -1;
		}
		if(head==null) {
			return -1;
		}
		int i=0;
		Node current=head;
		while(current!=null) {
			if(i==index) {
				return current.value;
			}
			current=current.next;
			i++;
		}
		return -1;
	}
	
	
 	public void display() {
		Node current=head;
		while(current!=null) {
			System.out.println(current.value+" -->");
			current=current.next;
		}
		System.out.println("END");
	}

}
