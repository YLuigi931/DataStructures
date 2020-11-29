package Structures1;

public class QuickUnion {
	
	
	private int[] id;
	private int counter;
	
	public QuickUnion(int length) {
		this.counter = length;
		id = new int[length];
		for(int i = 0; i < length ; i++) {
			id[i] = i;
		}
	}
	
	public int getCounter() {
		return this.counter;
	}
	
	public boolean connected(int x, int y) {
		return find(x) == find(y);
	}
	
	public int find(int x) {
		while(x != id[x]) {
			x = id[x];
		}
		return x;
	}
	
	public void union(int x, int y) {
		int i = find(x);
		int j = find(y);
		
		if(i == j) return;
		id[i] = j;
		counter --;
		
	}
	
	public void print() {
		System.out.print("[ ");
		for(int i = 0; i < id.length; i++) {
			System.out.printf("%d, ",id[i]);
		}
		System.out.printf("] %d \n", counter);
	}

	public static void main(String[] args) {
		QuickUnion list = new QuickUnion(10);
		list.print();
		
		list.union(4,3);
		list.print();
		
		list.union(3,8);
		list.print();
		
		list.union(6,5);	
		list.print();
		
		list.union(9,4);
		list.print();
		
		list.union(2,1);
		list.print();
		
		list.union(5,0);
		list.print();
		
		list.union(7,2);
		list.print();
		
		list.union(6,1);	
		list.print();
		
//		list.union(1,3);
//		list.print();
		
		System.out.println(list.connected(1, 7));

	}

}
