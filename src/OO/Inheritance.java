package OO;

import java.util.*;

class Person {
	protected String firstName;
	protected String lastName;
	protected int idNumber;
	
	// Constructor
	Person(String firstName, String lastName, int identification){
		this.firstName = firstName;
		this.lastName = lastName;
		this.idNumber = identification;
	}
	
	// Print person data
	public void printPerson(){
		 System.out.println(
				"Name: " + lastName + ", " + firstName 
			+ 	"\nID: " + idNumber); 
	}
	 
}

class Student extends Person implements Grade {
	private int[] testScores;

    /*	
    *   Class Constructor
    *   
    *   @param firstName - A string denoting the Person's first name.
    *   @param lastName - A string denoting the Person's last name.
    *   @param id - An integer denoting the Person's ID number.
    *   @param scores - An array of integers denoting the Person's test scores.
    */
    // Write your constructor here
    
    public Student(String firstname, String lastName, Integer id, int[] scores) {
        super(firstname, lastName, id);
        this.testScores = scores;
    }

    public Character getGradeScale(int[] scores){
        int sum = 0;
        
        for (int i = 0; i < scores.length; i++) {
            sum += scores[i];
        }
        
        int avg = sum / scores.length;
        
        if (avg >= 90 && avg <= 100){
            return 'O';
        } else if (avg >= 80 && avg < 90){
            return 'E';
        } else if (avg >= 70 && avg < 80) {
            return 'A';
        } else if (avg >= 55 && avg < 70){
            return 'P';
        } else if (avg >= 40 && avg < 55) {
            return 'D';
        } else if (avg < 40) {
            return 'T';
        }
        
        return null;
    }

    /*	
    *   Method Name: calculate
    *   @return A character denoting the grade.
    */
    // Write your method here
    public Character calculate() {
        return getGradeScale(testScores);
    }
}

interface Grade {
    public Character getGradeScale(int[] avarage);
}

class Inheritance {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		String firstName = scan.next();
		String lastName = scan.next();
		int id = scan.nextInt();
		int numScores = scan.nextInt();
		int[] testScores = new int[numScores];
		for(int i = 0; i < numScores; i++){
			testScores[i] = scan.nextInt();
		}
		scan.close();
		
		/*
		 * INPUT EXAMPLE:
		   Davi Pereira 9987654
		   4 100 45 60 85
		 */
		
		
		Student s = new Student(firstName, lastName, id, testScores);
		s.printPerson();
		System.out.println("Grade: " + s.calculate() );
		
		/*
		 * OUTPUT EXAMPLE:
		   Name: Pereira, Davi
		   ID: 9987654
           Grade: A
		 */
	}
}
