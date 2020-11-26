package Structures1;

/**
 * 
 * Insert on right side of the linked list
 * Remove from the left side of the linked list
 *      
 * @author Luigi
 * 
 */
public class Queue {
	
	nodeY head;
	int length;
	
	public Queue() {
		this.head = null;
		this.length = 0;
	}
	
	public void insert(int data) {
		
		if(head == null) {
			nodeY newnodeY = new nodeY(data);
			this.head = newnodeY;
			this.length += 1;
			
		}else {
			for(nodeY first = head; first != null; first = first.next) {
				if(first.next == null) {
					nodeY newnodeY = new nodeY(data);
					first.next = newnodeY;
					this.length += 1;
					return;
				}
			}
		}
	}
	
	public void remove() {
		if(head == null) {
			System.out.println("Nothing here");
			return;
		}else {
			head= head.next;
			this.length -= 1;
		}
	}
	
	/*
	 * Prints the nodeYs from left to right
	 */
	public void print() {
		System.out.print("HEAD ");
		for(nodeY first = head; first != null; first = first.next) {
			System.out.format("{ %d } => ", first.data);
			if(first.next == null) System.out.print("TAIL\n");
		}
	}
	
	
	public static void main(String[] args) {
		Queue list = new Queue();
		list.insert(10);
		list.print();
		list.insert(11);
		list.print();
		list.insert(12);
		list.print();
		list.insert(13);
		list.print();
		list.insert(14);
		list.print();
		list.remove();
		list.print();
		list.remove();
		list.print();
		
	}

}

class nodeY{
	int data;
	nodeY next;
	
	public nodeY(int value) {
		this.data = value;
		this.next = null;
	}
}
