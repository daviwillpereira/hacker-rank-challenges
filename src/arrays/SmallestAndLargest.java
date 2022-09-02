package arrays;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class SmallestAndLargest {
	public static String getSmallestAndLargest(String s, int k) {
		String smallest = "";
		String largest = "";

		List<String> substrings = new ArrayList<>();
		for (int i = 0; i < s.length(); i++) {
			if (i == s.length() - k) {
				substrings.add(s.substring(i, s.length()));
				break;
			}
			substrings.add(s.substring(i, k + i));

		}

		String[] array = substrings.toArray(new String[0]);
		java.util.Arrays.sort(array);
		smallest = array[0];
		largest = array[array.length - 1];
		return smallest + "\n" + largest;
	}

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		String s = scan.next();
		int k = scan.nextInt();
		scan.close();

		System.out.println(getSmallestAndLargest(s, k));
	}
}
