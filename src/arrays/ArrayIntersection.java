package arrays;

import java.util.ArrayList;
import java.util.List;

/* 18/09/22
 Given an Array of strings: {"Douglas", "Raymund", "Nagender", "Satya"}
 Find the set of common characters (intersection) across all strings (expected answer: {'a'})
 for example: Intersection of {1, 2, 3} and {3, 4, 2, 5} = {2, 3}
 Intersection of {'J', 'o', 'h', 'n'} and {'J', 'a', 's', 'o', 'n'} 
 and {'J', 'e', 'n', 'n', 'i', 'f', 'e', 'r'} = {'J', 'n'}
 */

public class ArrayIntersection {

	public static void main(String[] args) {
		
		String[] arr = {"1Douglas", "1Raymund", "1Nagender", "1Satya"};
		
		
		String pivot = arr[0].toLowerCase();
		List<Character> result = new ArrayList<>();
		
		for (Character c : pivot.toCharArray()) {
			for (int i = 1; i < arr.length; i++) {
				if (!arr[i].toLowerCase().contains(String.valueOf(c))) {
					break;
				} 
				
				if (arr.length-1 ==  i) {
					result.add(c);
				}
			}
		}
		
		System.out.println(result);
	}

}
