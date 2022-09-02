package collections;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class DictionariesAndMaps {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        
        Map<String, Integer> phoneBook = new HashMap<>();
        
        for(int i = 0; i < n; i++){
            String name = in.next();
            int phone = in.nextInt();
            phoneBook.put(name, phone);
        }
        
        while(in.hasNext()){
            String s = in.next();
            Integer mapReturn = phoneBook.get(s);
            if (mapReturn != null) {
            	System.out.println(s + "=" + mapReturn);
            } else {
            	System.out.println("Not found");
            }
        }
        in.close();
	}
}
