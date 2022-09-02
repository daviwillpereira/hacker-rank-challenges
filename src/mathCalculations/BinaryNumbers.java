package mathCalculations;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BinaryNumbers {

	public static void main(String[] args) throws IOException {
		BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(bufferedReader.readLine().trim());
        int consecutiveOnes = 0;
        int count = 0;
        //convert to binary (base-2)
        String nBase2 = Integer.toBinaryString(n);
        //find and print the base-10 integer maximum number of consecutive 1's in n's binary representation
        for(int i = 0; i < nBase2.length(); i++) {
            if (nBase2.charAt(i) == '1') {
            	count++;
            	if (consecutiveOnes < count) {
            		consecutiveOnes = count;
            	}
            } else {
            	count = 0;
            }
        }
        
        System.out.println(consecutiveOnes);
        bufferedReader.close();
	}

}
