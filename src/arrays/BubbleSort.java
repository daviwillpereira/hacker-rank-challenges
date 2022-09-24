package arrays;

import java.util.Arrays;

// 19/09/22

public class BubbleSort {

	public static void main(String[] args) {
		int[] arr  = {77, 87, 4, 77, 54, 2, 11, 2};
		int n = arr.length;
		
		int aux = 0;
		int numSwaps = 0;
		
		for (int i = 0; i < n-1; i++) {
			for (int j = i+1; j < n; j++) {
				if (arr[i] > arr[j]) {
					aux = arr[i];
					arr[i] = arr[j];
					arr[j] = aux;
					numSwaps++;
				}
			}
		}
		
		Arrays.sort(arr);
		System.out.println(Arrays.toString(arr));
		System.out.println(numSwaps + " swaps");
	}
}
