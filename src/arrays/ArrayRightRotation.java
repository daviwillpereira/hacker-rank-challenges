package arrays;

import java.util.Arrays;

public class ArrayRightRotation {

	// Function to rightRotate array
	static int[] RightRotate(int a[], int n, int k) {
		
		int[] result = new int[n];
		
		// If rotation is greater
		// than size of array
		k = k % n;
		for (int i = 0; i < n; i++) {
			if (i < k) {
				// Printing rightmost
				// kth elements
				result[i] = a[n + i - k];
			} else {
				// Prints array after
				// 'k' elements
				result[i] = a[i - k];
			}
		}
		return result;
	}

	// Driver program
	public static void main(String args[]) {
		int Array[] = { 1, 2, 3, 4, 5 };
		int N = Array.length;

		int K = 3;
		int[] lol = RightRotate(Array, N, K);
		
		System.out.println(Arrays.toString(lol));

	}

}
