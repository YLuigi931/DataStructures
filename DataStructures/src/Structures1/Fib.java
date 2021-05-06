package Structures1;



public class Fib {
	
	public static int getNithFib(int n) {
		
		int counter = 3;
		int[] cache = {0,1};
		
		while(counter <= n) {
			
			int next = cache[0] + cache[1];
			cache[0] = cache[1];
			cache[1] = next;
			
			counter++;
		}
		
		if(n > 1)
			return cache[1];
		else
			return cache[0];
	}
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println(getNithFib(6));

	}

}
