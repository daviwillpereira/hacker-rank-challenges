package codeChallenges.codility;

import java.util.Arrays;

public class SmallestPositiveIntegerNotOcurringInAGivenArray {
	/*
	 * 21/09/22
	 * 
	 * This is a demo task. Codility
	 * 
	 * Write a function:
	 * 
	 * class Solution { public int solution(int[] A); }
	 * 
	 * that, given an array A of N integers, returns the smallest positive integer
	 * (greater than 0) that does not occur in A.
	 * 
	 * For example, given A = [1, 3, 6, 4, 1, 2], the function should return 5.
	 * 
	 * Given A = [1, 2, 3], the function should return 4.
	 * 
	 * Given A = [−1, −3], the function should return 1.
	 * 
	 * Write an efficient algorithm for the following assumptions:
	 * 
	 * N is an integer within the range [1..100,000]; each element of array A is an
	 * integer within the range [−1,000,000..1,000,000].
	 */
	public static int solution(int[] A) {
		boolean onlyNegative = true;
		Arrays.sort(A);

		int N = A.length;
		
		if (N < 1 || N > 100000) {
			return 1;
		}
		
		for (int i = 0; i < N; i++) {
			if (A[i] < -1000000 || A[i] > 1000000) {
				return 1;
			}
		}
		
		for (int i = 0; i < N; i++) {
			
			if (A[i] > 0) {
				onlyNegative = false;
				if (i == N - 1) {
					return A[i] + 1;
				}
				if (A[i + 1] - A[i] > 1) {
					return A[i] + 1;
				}
			}
			if (i == N - 1 && onlyNegative) {
				return 1;
			}
		}

		return 0;
	}

	public static void main(String[] args) {
		// int[] arr = {1, 3, 6, 4, 1, 2};
		// int[] arr = {10, 20, 30, 40, 50};
		// int[] arr = {1, 3, 6, -5, 4, 1, 2};
		// int[] arr = { 1, 2, 3 };
		 int[] arr = { 10000009, 1 };
		// int[] arr = {-1, -3};
		System.out.println(SmallestPositiveIntegerNotOcurringInAGivenArray.solution(arr));
	}
}
