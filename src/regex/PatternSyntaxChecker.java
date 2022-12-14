package regex;

import java.util.Scanner;
import java.util.regex.Pattern;
import java.util.regex.PatternSyntaxException;

public class PatternSyntaxChecker {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int testCases = Integer.parseInt(in.nextLine());
		
		/* INPUT
		 * 3
		 * ([A-Z])(.+)
		 * [AZ[a-z](a-z)
		 * batcatpat(nat
		 */ 
		
		while (testCases > 0) {
			String pattern = in.nextLine();
			// Write your code
			try {
				Pattern.compile(pattern);
				System.out.println("Valid");

			} catch (PatternSyntaxException e) {
				System.out.println("Invalid");
			} finally {
				testCases--;
			}
		}

		in.close();
	}
}
