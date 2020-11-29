package Structures1;

public class QuickFind {
	
	private int[] id;
	private int counter;
	
	public QuickFind(int n) {
		counter = n;
		id = new int[n];
		for(int i = 0; i < n ; i++) {
			id[i] = i;
		}
	}
	
	public int getCounter(){
		return this.counter;
	}
	
	public int find(int x) {
		//constant
		return id[x];
	}
	
	public boolean connected(int x, int y) {
		return find(x) == find(y);
	}
	
	public void union(int x, int y) {
		//TODO
		int xID = find(x);
		int yID = find(y);
		
		if(xID == yID) return;
		
		for(int i = 0; i < id.length; i++) {
			// update the xID to yID
			// when every element is the same value as yID means their all connected
			if(id[i] == xID) {
				id[i] = yID;
			}
		}
		
		
		
	}
	
	public void print() {
		System.out.print("[ ");
		for(int i = 0; i < id.length; i++) {
			System.out.printf("%d, ",id[i]);
		}
		System.out.println(" ]\n");
	}
	

	public static void main(String[] args) {
		
		QuickFind list = new QuickFind(10);
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
		
		list.union(1,3);
		list.print();
		
		System.out.println(list.connected(1, 9));
		

	}

}
