package arrays;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;

public class MaximumOfMinimums {
	public static void main(String[] args) {

		List<Integer> space = new LinkedList<>(
				Arrays.asList(1546, 523123, 1256479714, 5465466, 54645656, 6798795, 234234));
		int segment = 4;
		List<Integer> mins = new ArrayList<>();

		while (space.size() >= segment) {
			System.out.println(space.subList(0, segment) + " | Min:" + Collections.min(space.subList(0, segment)));
			mins.add(Collections.min(space.subList(0, segment)));
			space.remove(0);
		}
		System.out.println(mins);
		System.out.println("\nMaximum of the minimums:" + Collections.max(mins));
	}
}
