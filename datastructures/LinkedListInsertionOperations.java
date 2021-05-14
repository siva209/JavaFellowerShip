package com.datastructures;

public class LinkedListInsertionOperations {
	Node head;

	static class Node {
		int data;
		Node next;

		Node(int data) {
			this.data = data;
			
		}
	}

	
			
	
		

	
	public void insertAtfirst(int newdata) {
		Node newNode=new Node(newdata);
		if(head==null) {
			head=newNode;
		}
		else {
			Node n=head;
			head=newNode;
			newNode.next=n;
		}
		
	}
	
	
	public void insetAtafter(Node prevnode, int newdata) {
		if (prevnode == null) {
			System.out.println("prev node cannot be null");
			

		}
		Node newnode = new Node(newdata);
		newnode.next = prevnode.next;
		prevnode.next = newnode;

	}
	
	public void insertAtend(int newdata) {
		Node newnode = new Node(newdata);
		if (head == null) {
			head = new Node(newdata);
			
		}
		newnode.next = null;
		Node last = head;
		while (last.next != null) 
			last = last.next;
		last.next = newnode;
		return;
	}
	
	
	
		public void printList() {
			Node n = head;
			while (n != null) {
				System.out.print(" " + n.data);
				n = n.next;
			}
		}
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LinkedListInsertionOperations i = new LinkedListInsertionOperations();
		i.head = new Node(10);
		Node second = new Node(20);
		Node third = new Node(30);
		Node four=new Node(40);
		i.head.next=second;
		second.next=third;
		third.next=four;
		
		System.out.println("original list");
	    i.printList();
		System.out.println(" \n insert data at big");
		i.insertAtfirst(70);
		i.printList();
		System.out.println("\n insert at after");
		i.insetAtafter(i.head.next.next, 12);
			i.printList();
			System.out.println("\n insert at end");
			i.insertAtend(20);
			i.printList();
		}
	}
