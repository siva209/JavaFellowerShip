package com.datastructures;

public class LinkedListDemo {
	Node head;
	
static class Node{
		int data;
		Node next;
		
		Node(int data){
			this.data=data;
			this.next=null;
		}
	}

public void printllist() {
	
	Node n=head;
	
	if(n==null) {
		System.out.println("linked list is empty-");
	
		
	}
	else {
		while(n!=null) {
			System.out.print(" "+n.data);
			n=n.next;
		}
		
	}
}




public static void main(String[] args) {
	LinkedListDemo l=new LinkedListDemo();
	l.head=new Node(1);
    Node second=new Node(2);
    Node third=new Node(3);
    
    l.head.next=second;
    second.next=third;
	l.printllist();
}

}
