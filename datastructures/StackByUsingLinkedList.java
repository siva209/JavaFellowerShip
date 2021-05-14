package com.datastructures;

public class StackByUsingLinkedList {
		StackNode head;

		static class StackNode {
			int data;
			StackNode next;

			StackNode(int data){
				this.data = data; }
		}

		public boolean isEmpty()
		{
			if (head == null) {
				return true;
			}
			else
				return false;
		}

		public void push(int data)
		{
			StackNode newNode = new StackNode(data);

			if (head == null) {
				head = newNode;
			}
			else {
				StackNode temp = head;
				head= newNode;
				newNode.next = temp;
			}
			System.out.println(data + " pushed to stack");
		}

		public int pop()
		{
			int popped = Integer.MIN_VALUE;
			if (head == null) {
				System.out.println("Stack is Empty");
			}
			else {
				popped = head.data;
				head = head.next;
			}
			return popped;
		}

		public int peek()
		{
			if (head == null) {
				System.out.println("Stack is empty");
				return 0; 
				
			}
			else {
				return head.data;
			}
		}
	

		
		public static void main(String[] args)
		{

			StackByUsingLinkedList sll = new StackByUsingLinkedList();
			//System.out.println(sll.isEmpty());

			sll.push(10);
			sll.push(20);
			sll.push(30);

		System.out.println(sll.pop()
							+ " popped from stack");

			System.out.println("Top element is " + sll.peek());
		}
	}


