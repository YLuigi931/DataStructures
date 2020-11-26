package Structures1;

public class DoubleLinkedList {
	
	dNode head;
	int length;
	
	public DoubleLinkedList() {
		this.head = null;
		this.length = 0;
	}
	
	public void insertLeft(int value) {
		if(head == null) {
			dNode newNode = new dNode(value);
			this.head = newNode;
			length +=1 ;
		}else {
			dNode newNode = new dNode(value);
			newNode.next = head;
			this.head.prev = newNode;
			this.head = newNode;
			
		}
		
	}
	
	public void insertRight(int value) {
		if(head == null) {
			dNode newNode = new dNode(value);
			this.head = newNode;
			length +=1 ;
		}else {
			for(dNode first = head; first != null; first = first.next) {
				if(first.next == null) {
					dNode newNode = new dNode(value);
					first.next = newNode;
					newNode.prev = first;
					this.length += 1;
					return;
				}
			}
		}
	}
	
	public boolean contatins() {
		return false;
	}
	
	public void delete(int value) {
		if(head.data == value) {
			head= head.next;
			head.prev = null;
			this.length -= 1;
		}else {
			for(dNode first = head; first !=null; first = first.next) {
				if(first.next.data == value && first.next.next == null) { // last
					first.next =null;
					this.length -= 1;
					return;
				}else if(first.next.data == value) {
					first.next.next.prev = first;
					first.next = first.next.next;
					this.length -= 1;
					return;
				}
			}
		}
	}
	
	
	
	/*
	 * Prints the nodeYs from left to right
	 */
	public void print() {
		System.out.print("HEAD ");
		for(dNode first = head; first != null; first = first.next) {
			System.out.format("{ %d } => ", first.data);
			if(first.next == null) System.out.print("TAIL\n");
		}
	}
	
	public static void main(String[] args) {
		DoubleLinkedList list = new DoubleLinkedList();
		list.insertLeft(1);
		list.insertLeft(2);
		list.insertLeft(3);
		list.insertLeft(4);
		list.print();
		
		list.insertRight(5);
		list.insertRight(6);
		list.insertRight(7);
		list.print();
		list.delete(5);
		list.print();
		list.delete(6);
		list.print();
	}

}

class dNode {
	int data;
	dNode prev;
	dNode next;
	
	public dNode(int value) {
		this.data = value;
		this.prev = null;
		this.next = null;
	}
	
}
