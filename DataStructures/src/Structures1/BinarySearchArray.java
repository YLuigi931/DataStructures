package Structures1;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class BinarySearchArray {
	
	
	public static boolean search(int[] sample, int target) {
		
		// array needed to be sorted or assume to be sorted and no doubles
		Arrays.sort(sample);
		
//		for(int i = 0; i < sample.length; i++) {
//			System.out.print(sample[i]+", ");
//		}
//		System.out.println();
		
		int low = 0;
		int high = sample.length;
		while(low <= high) {
			
			int pivot = low + ( high - 1 ) / 2;
			
			// check if pivot is middle index of array 
			if(sample[pivot] == target) {
				return true;
			}
			
			// if middle element is bigger than target number 
			else if(sample[pivot] > target) {
				high = pivot - 1; // look at the left side of the array
			}
			
			// if middle element is smaller than target number 
			else {
				low = pivot + 1; // look at the right side of the array
			}
			
		}
		
		return false;
	}

	public static void main(String[] args) {
		
		int[] a = new int[] { 0, 2, 4, 6, 8, 10, 12, 14, 16 };
		int[] b = new int[] { 1, 18, 0, 4, 2, 5, 6 };
		int[] c = new int[] { 8, 7, 6, 5, 4, 3, 2, 1 };
		
//		System.out.println(search(a,0));
		
		int[]key = {0,1,7};
		int i = 0;
		
		List<int[]> samples = new ArrayList<>();
		samples.add(a);
		samples.add(b);
		samples.add(c);
		
		for(int[] arr : samples) {
			System.out.println(search(arr, key[i]));
			i++;
		}

	}

}
