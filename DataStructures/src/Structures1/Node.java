package Structures1;

public class Node {
	
	int value;
	Node next;
	
	public Node(int val) {
		this.value = val;
		this.next = null;
	}
	
	public int getValue() {
		return value;
	}


	public void setValue(int value) {
		this.value = value;
	}


	public Node getNext() {
		return next;
	}


	public void setNext(Node next) {
		this.next = next;
	}

	public String toString(){
		String result = String.format("this Node value %d ", this.value);
		return result;
	}


	public static void main(String[] args) {
		
		Node head1 = new Node(1);
		Node link2 = new Node(2);
		Node link3 = new Node(3);
		Node link4 = new Node(4);
		Node link5 = new Node(5);
		Node link6 = new Node(6);
		Node link7 = new Node(7);
		
		head1.next = link2;
		link2.next = link3;
		link3.next = link4;
		link4.next = link5;
		link5.next = link6;
		link6.next = link7;
		
		for(Node first = head1; first != null; first = first.next) {
			System.out.println(first.toString());
		}

	}

}
