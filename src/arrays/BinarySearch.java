package arrays;

import java.util.Arrays;

public class BinarySearch {
	
	public static void main(String[] args) {
		int[] arr = {555, 43, 765, 234, 2, 5, 77, 43};

		Arrays.sort(arr);
		
		int bs = bs(arr, 555, 0, arr.length-1);
		
		System.out.println(bs);
		
		
	}
	
	public static int bs(int[] arr, int key, int start, int end) {
		
		if (start > end) return -1;
		
		int med = (start + end) / 2;
		
		if(arr[med] == key) {
			return med;
		} 
		
		if (arr[med] > key) {
			return bs(arr, key, start, med-1);
		}
		
		if (arr[med] < key) {
			return bs(arr, key, med + 1, end);
		}
		
		return -1;
	}
}
