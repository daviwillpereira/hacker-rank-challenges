package algorithmicConcepts;

import java.util.Scanner;


class Difference {
  	private int[] elements;
  	public int maximumDifference;

	// Add your code here
    public Difference (int[] elements){
        this.elements = elements;
    }
    
    public void computeDifference() {
//        maximumDifference = 0;
//        int difference = 0;
//        for (int i = 0; i < elements.length; i++) {
//            for (int j = 1+i; j < elements.length-i; j++) {
//            	difference = elements[i] - elements[j];
//            	
//            	if (difference < 0 ) difference *= -1;
//                
//            	if (maximumDifference < difference) maximumDifference = difference;
//            }
//        }
    	int min=elements[0];
        int max=elements[0];
        for(int i=0;i<elements.length;i++)
            {
            if(elements[i]<min)
                {
                min=elements[i];
            }
            if(elements[i]>max)
                {
                max=elements[i];
            }                
        }
    maximumDifference = Math.abs(max-min);
    }
} // End of Difference class

public class Scope {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] a = new int[n];
        for (int i = 0; i < n; i++) {
            a[i] = sc.nextInt();
        }
        sc.close();

        Difference difference = new Difference(a);

        difference.computeDifference();

        System.out.print(difference.maximumDifference);
    }
}
