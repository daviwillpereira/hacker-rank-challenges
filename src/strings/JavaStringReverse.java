package strings;
import java.util.Scanner;

public class JavaStringReverse {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		String A = sc.next();
		/* Enter your code here. Print output to STDOUT. */
		StringBuilder sb = new StringBuilder();
		sb.append(A);
		sb.reverse();
		String reverse = new String(sb);
		if (A.equals(reverse)) {
			System.out.println("Yes");
		} else {
			System.out.println("No");
		}
	}
}
