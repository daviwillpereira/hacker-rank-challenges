package strings;

import java.util.HashMap;
import java.util.Map;
import java.util.Optional;
import java.util.Scanner;
import java.util.regex.Pattern;

public class TheMostRepeatedCharacter {

//	private String solution(String a) {
//		int[] aArray = new int[256];
//
//		String mostRepeatedChar = null;
//		int highestOcurrencies = 0;
//		for (int i = 0; i < a.length(); i++) {
//			aArray[a.charAt(i)] += 1;
//		}
//
//		for (int i = 0; i < aArray.length; i++) {
//			if (aArray[i] > highestOcurrencies) {
//				highestOcurrencies = aArray[i];
//				mostRepeatedChar = String.valueOf((char) i);
//			}
//		}
//		return mostRepeatedChar;
//	}

	private String solution(String a) {
		Map<Character, Integer> charactersMap = new HashMap<>();
		int higherOcurrencies = 0;
		
		// Iterate through the string
		for (int i = 0; i < a.length(); i++) {
			Character currentChar = a.charAt(i);
			if (Pattern.matches("^[a-z A-Z]", String.valueOf(currentChar))) {
				Optional<Integer> ocurrencies = Optional.ofNullable(charactersMap.get(a.charAt(i)));
				ocurrencies.ifPresentOrElse(o -> {
					
					charactersMap.put(currentChar, o + 1);
					
				}, () ->  charactersMap.put(currentChar, 1));
			}
		}
		System.out.println(charactersMap);
		return null;
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String a = sc.nextLine();
		String output = new TheMostRepeatedCharacter().solution(a);
		System.out.println(output);

		sc.close();
	}

}
