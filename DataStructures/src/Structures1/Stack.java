package Structures1;

/**
 * A linear data structure in which elements can be inserted and deleted on the right side of the list.
 * Right side of the list will be represented as the top.
 * Stack follows the LIFO(last in first out) principle
 * 
 * APPLICATION Uses:
 * 	- Function Calls/Recursion
 * 	- Undo in an Editor
 * 
 *@author Luigi 
 * 
 */

public class Stack {
	
	Nod head;
	int length;
	
	public Stack() {
		this.head = null;
		this.length = 0;
	}
	
	
	/**
	 * Insert on the right side of the linked list
	 * @param Val is the Nodes value
	 * 
	 */
	public void push(int val) {
		if(head == null){
			Nod newHead = new Nod(val);
			this.head = newHead;
			length = 1;
		}else {
			for(Nod first = head; first != null; first = first.next) {
				if(first.next == null) {
					Nod newLinked = new Nod(val);
					first.next = newLinked;
					this.length += 1;
					return;
				}
			}
		}
	}
	
	/**
	 * @return the right node value of the linked list and deletes the node
	 */
	public int pop() {
		int val = 0;
		if(this.length ==1) {
			val = this.head.value;
			this.head = null;
			this.length -= 1;
			return val;
		}
		for(Nod first = head; first != null; first = first.next) {
			if(first.next.next == null) { // last
				val = first.next.value;
				first.next = null;
				this.length -= 1;
				return val;
			}
		}
		return val;
	}
	/**
	 * Looks at the top portion of the list
	 */
	public int peek() {
		
		int top = 0;
		for(Nod first = head; first != null; first = first.next) {
			if(first.next.next == null) { // last
				top = first.next.value;
			}
		}
		return top;
	}
	
	public boolean isEmpty() {
		return this.length == 0;
	}
	
	/*
	 * Prints the nodes from left to right
	 */
	public void print() {
		System.out.print("BOTTOM ");
		for(Nod first = head; first != null; first = first.next) {
			System.out.format("{ %d } => ", first.value);
			if(first.next == null) System.out.print("TOP\n");
		}
	}

	public static void main(String[] args) {
		
		Stack first = new Stack();
		first.push(10);
		first.push(11);
		first.push(12);
		first.print();
		first.pop();
		first.print();
		first.pop();
		first.print();
		System.out.println(first.isEmpty());
		first.pop();
		first.print();
		System.out.println(first.isEmpty());
	}
}

/**
 *  Nodes
 */
class Nod{
	int value;
	Nod next;
	
	public Nod(int val) {
		this.value = val;
		this.next = null;
	}
}
