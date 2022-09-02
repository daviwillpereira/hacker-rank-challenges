package collections;

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.Scanner;

public class ValidParentheses {

	public static boolean isValid(String s) {
		
		Deque<Character> stk = new ArrayDeque<>();
		
		for (Character c : s.toCharArray()) {
			if(c=='(' || c=='{' || c=='[')
            {
                stk.push(c);
            }else
            {
              
                if(stk.isEmpty()) return false;
                if(stk.peek()=='(' &&c!=')') return false;
                  if(stk.peek()=='[' &&c!=']') return false;
                  if(stk.peek()=='{' &&c!='}') return false;
                stk.pop();
            }
        }
        return stk.isEmpty();
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String s = sc.nextLine();
		if ( ValidParentheses.isValid(s)) {
			System.out.println("Valid");
		} else {
			System.out.println("Not Valid");
		}
		sc.close();
	}
}
