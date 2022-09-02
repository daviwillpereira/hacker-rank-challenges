package arrays;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.IntStream;
import java.util.stream.Stream;
import static java.util.stream.Collectors.toList;


public class TwoDimensionsArrayHourglasses {
	//https://www.hackerrank.com/challenges/30-2d-arrays/problem?isFullScreen=true
	
	/*
	 * Sample Input:

		1 1 1 0 0 0
		0 1 0 0 0 0
		1 1 1 0 0 0
		0 0 2 4 4 0
		0 0 0 2 0 0
		0 0 1 2 4 0
	 */
	public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        List<List<Integer>> list = new ArrayList<>();

        IntStream.range(0, 6).forEach(i -> {
            try {
                list.add(
                    Stream.of(bufferedReader.readLine().replaceAll("\\s+$", "").split(" "))
                        .map(Integer::parseInt)
                        .collect(toList())
                );
            } catch (IOException ex) {
                throw new RuntimeException(ex);
            }
        });
        
        Integer[][] arr = list.stream()
                          .map(l -> l.stream().toArray(Integer[]::new))
                          .toArray(Integer[][]::new);
                          
        int sum[] = new int[16];
        int h = 0;
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 4; j++) {
                sum[h] = arr[i][j] + arr[i][j+1] + arr[i][j+2]
                       + arr[i+1][j+1] 
                       + arr[i+2][j] + arr[i+2][j+1] + arr[i+2][j+2];
                h++;
        }
    }
    Arrays.sort(sum);
    System.out.println(sum[15]);
        
        
        

        bufferedReader.close();
    }
}
