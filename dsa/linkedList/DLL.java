package dsa.linkedList;

import dsa.linkedList.LL.Node;

public class DLL {
	private Node head;
	private int size;
	DLL(){
		this.size=0;
	}
	
	private class Node{
		Node prev;
		Node next;		
		int value;
		Node(int value){
			this.value=value;
		}
		Node(int value,Node prev,Node next){
			this.value=value;
			this.prev=prev;
			this.next=next;
	}
		
		public void insertFirst(int value) {
			
		}

	
	}

	public void insertFirst(int value) {
		 Node node = new Node(value);
	        node.next = head;
	        node.prev = null;
	        if (head != null) {
	            head.prev = node;
	        }
	        head = node;
		
	}

	public void insertLast(int value) {
		Node node = new Node(value);
        Node last = head;

        node.next = null;

        if (head == null) {
            node.prev = null;
            head = node;
            return;
        }

        while (last.next != null) {
            last = last.next;
        }

        last.next = node;
        node.prev = last;
	}
	
	
	public void display() {
		if(head==null) {
			System.out.println("Empty list");
			return;
		}		
		Node current=head;
		
		while(current!=null) {
			System.out.println(current.value);
		    current=current.next;
		}
		
	}
}
