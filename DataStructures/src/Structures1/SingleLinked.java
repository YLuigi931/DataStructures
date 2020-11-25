package Structures1;

/**
 * @author Luigi
 * Linked List
 * 
 */
public class SingleLinked {

	Nodes head;
	int length;
	
	public SingleLinked() {
		this.head = null;
		this.length = 0;
	}
	
	/**
	 * Insert on the left side of the linked list
	 * @param Val is the Nodes value
	 * 
	 */
	public void insertLeft(int val) {
		if(head == null) {
			Nodes newHead = new Nodes(val);
			this.head = newHead;
			length = 1;
		}else {
			Nodes newLink = new Nodes(val);
			newLink.next = this.head;
			this.head = newLink;
			this.length +=1;
		}
	}
	
	/**
	 * @return the left node value of the linked list and deletes the node
	 */
	public int popLeft() {
		int val = head.value;
		head = head.next;
		this.length -=1;
		return val;
	}
	
	/**
	 * @return the right node value of the linked list and deletes the node
	 */
	public int popRight() {
		int val = 0;
		if(this.length ==1) {
			val = this.head.value;
			this.head = null;
			this.length -= 1;
			return val;
		}
		for(Nodes first = head; first != null; first = first.next) {
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
	 * Insert on the right side of the linked list
	 * @param Val is the Nodes value
	 * 
	 */
	public void insertRight(int val) {
		if(head == null){
			Nodes newHead = new Nodes(val);
			this.head = newHead;
			length = 1;
		}else {
			for(Nodes first = head; first != null; first = first.next) {
				if(first.next == null) {
					Nodes newLinked = new Nodes(val);
					first.next = newLinked;
					this.length += 1;
					return;
				}
			}
		}
	}
	
	/**
	 * Delete a specific node based on the parameter
	 * @param Val is the value of the specific node
	 */
	public void delete(int val) {
		
		if(this.head.value == val) { // first
			head = head.next;
			this.length -= 1;
			return;
		}
		for(Nodes first = head; first != null; first = first.next) {
			
			if(first.next.value == val && first.next.next == null) { // last
				first.next = null;
				this.length -= 1;
				return;
			}else if(first.next.value == val) { // middle
				first.next = first.next.next;
				this.length -=1 ;
				return;
			}
		}
	}
	
	/*
	 * Prints the nodes from left to right
	 */
	public void print() {
	
		for(Nodes first = head; first != null; first = first.next) {
			System.out.format("{ %d } => ", first.value);
			if(first.next == null) System.out.print("NULL");
		}
	}
	
	public static void main(String[] args) {
		SingleLinked start = new SingleLinked();
		start.insertLeft(1);
		start.insertLeft(2);
		start.insertLeft(3);
		start.insertLeft(4);
		
		start.print();
		System.out.format("\nThe current length %d\n",start.length);
		
		start.insertRight(12);
		start.insertRight(13);
		start.insertRight(14);
		start.insertRight(15);
		start.print();
		
		System.out.format("\nThe current length %d\n",start.length);
		
		start.delete(1);
		start.print();
		System.out.println();
		start.delete(12);
		start.print();
		System.out.println();
		start.delete(2);
		start.print();
		System.out.println();
		System.out.format("\nThe current length %d\n",start.length);
		
		start.delete(15);
		start.print();
		System.out.println();
		start.delete(4);
		start.print();
		System.out.format("\nThe current length %d\n",start.length);
		System.out.println(start.popLeft());
		start.print();
		System.out.println();
		System.out.format("\nThe current length %d\n",start.length);
		System.out.println(start.popRight());
		start.print();
		System.out.format("\nThe current length %d\n",start.length);
		
	}
}

/**
 *  Nodes
 */
class Nodes{
	int value;
	Nodes next;
	
	public Nodes(int val) {
		this.value = val;
		this.next = null;
	}
}


