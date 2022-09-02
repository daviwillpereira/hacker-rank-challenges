package regex;

import java.util.Scanner;

class RegexIP{

    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        while(in.hasNext()){
            String IP = in.next();
            System.out.println(IP.matches(new MyRegex().pattern));
        }
        
        in.close();
    }
}


//Write your code here
class MyRegex {
    
    public String pattern;
    
    /*
      IP address is a string in the form "A.B.C.D", 
      where the value of A, B, C, and D may range from 0 to 255. Leading zeros are allowed. 
      The length of A, B, C, or D can't be greater than 3.
    */
    
    public MyRegex() {
        String zeroTo255 = "([0-9]|[0-9][0-9]|(0|1)[0-9][0-9]|2[0-4][0-9]|25[0-5])"; 
        this.pattern = zeroTo255 + "." + zeroTo255 + "." + zeroTo255 + "." + zeroTo255;
    }
    
    
}
