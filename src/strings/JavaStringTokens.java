package strings;

import java.util.Scanner;
import java.util.regex.Pattern;
import java.util.stream.Stream;

public class JavaStringTokens {

	public static void main(String[] args) {

		// s = He is a very very good boy, isn't he?
		// OUTPUT:
		// 10
		// He
		// isA
		// a
		// very
		// very
		// good
		// boy
		// isn
		// t
		// he
		Scanner scan = new Scanner(System.in);
		String s = scan.nextLine();
		// Write your code here.

		boolean isValidString = Pattern.matches("[A-Za-z !,?._'@]+", s);

		if (isValidString && (s.length() >= 1 && s.length() <= 400_000) && !s.trim().isEmpty()) {
			s = s.trim();
			String[] tokens = s.split("[\\s!,?._'@]+");

			int size = tokens.length > 0 ? tokens.length : 0;
			System.out.println(size);
			Stream.of(tokens).forEach(System.out::println);

			// StringTokenizer st = new StringTokenizer(s," !,?._'@");
			// System.out.println(st.countTokens());
			// while(st.hasMoreTokens()){
			// System.out.println(st.nextToken());
			// }

		} else {
			System.out.println(0);
		}

		scan.close();
	}
}
