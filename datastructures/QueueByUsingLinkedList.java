package com.datastructures;

public class QueueByUsingLinkedList {
	QNode front, rear;
	

	public QueueByUsingLinkedList()
	{
		this.front =null;
	   this.rear = null;
	}
	
	
	class QNode {
		int key;
		QNode next;

		
		public QNode(int key)
		{
			this.key = key;
			this.next = null;
		}
	}

		void enqueue(int key)
		{
			QNode temp = new QNode(key);
			
			if (rear == null) {
				front = rear = temp;
				return;
			}

			
			rear.next = temp;
			rear = temp;
		}

		
		void dequeue()
		{
			
			if (front == null)
				return;

		
			QNode temp = this.front;
			front = this.front.next;

			
			if (front == null)
				rear = null;
		}
	
	
		public static void main(String[] args)
		{
			QueueByUsingLinkedList q = new QueueByUsingLinkedList();
			q.enqueue(10);
			q.enqueue(20);
			q.dequeue();
			q.dequeue();
			q.enqueue(30);
			q.enqueue(40);
			q.enqueue(50);
			q.dequeue();
			System.out.println("Queue Front : " + q.front.key);
			System.out.println("Queue Rear : " + q.rear.key);
		}
	}

