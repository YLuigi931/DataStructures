package Structures1;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class AlgoBFS {
		// Time O(v+e)
		// Space O(v)
	    String name;
	    List<AlgoBFS> children = new ArrayList<AlgoBFS>();

	    public AlgoBFS(String name) {
	      this.name = name;
	    }

	    public List<String> breadthFirstSearch(List<String> array) {
	      // Write your code here.
			List<String> ans = new ArrayList<String>();
			Queue<AlgoBFS> order = new LinkedList<AlgoBFS>();	
			order.add(this);
			while(!order.isEmpty()) {
				AlgoBFS current = order.poll();
				ans.add(current.name);
				order.addAll(current.children);
			}
				
				
	      return ans;
	    }

	    public AlgoBFS addChild(String name) {
	      AlgoBFS child = new AlgoBFS(name);
	      children.add(child);
	      return this;
	    }
	  

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
