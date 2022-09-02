package algorithmicConcepts;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

class Result {

	/*
	 * Complete the 'factorial' function below.
	 *
	 * The function is expected to return an INTEGER. The function accepts INTEGER n
	 * as parameter.
	 */

	public static int factorial(int n) {
		
		return (n > 1) ? n * factorial(n-1) : 1;
	}

}

public class Recursion3 {
	public static void main(String[] args) throws IOException {
		BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

		int n = Integer.parseInt(bufferedReader.readLine().trim());

		int result = Result.factorial(n);

		System.out.println(result);
		bufferedReader.close();
	}
}
