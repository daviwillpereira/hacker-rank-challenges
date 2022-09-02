package test;

public class Teste {

	static int solution(int n) {
	    System.out.println("teste");
	    
	    String s = String.valueOf(n);
	    int[] xy = new int[2];
	    
	    for (int i : xy) {
			xy[i] = Character.digit(s.charAt(i), 17);
		}

	    
	    
	    return 10;
	}
	
	public static void main(String[] args) {
		Teste.solution(12);
	}
}
