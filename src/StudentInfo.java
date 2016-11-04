/**
 * 
 


/**
 * @author A.briggs
 * /**

 *

 * Name:Althea Briggs 

 * Teacher:Mr.Hardman

 * Assignment #3, Program # 

 * Date Last Modified:Nov.4 

 *

 */
 *
 */import java.util.Scanner;

public class StudentInfo {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner userInput = new Scanner(System.in);
		
		 System.out.println("StudentInfo");
		 

		 String FirstName;
         String LastName;
         int Grade;
         int StudentID;
         String Login;
         double SchoolAverage;


         System.out.println("firstName: ");
         firstName = userInput.next();
        	 
         System.out.println("lastName: ");
         lastName = userInput.next();
         
         System.out.println("Grade: ");
         grade = userInput.nextInt();
         
         System.out.println("StudentID: ");
         studentID = userInput.nextInt();
         
         System.out.println("Login: ");
         login = userInput.next();

         System.out.println("School Average: ");
         schoolAverage = userInput.nextDouble();
         
         System.out.println("/n" + "Student info: ");
         System.out.println(String.format("%-16s"+ firstName, "FirstName: ") );
         System.out.println(String.format("%-16s"+ lastName, "LastName: ") );
         System.out.println(String.format("%-16s"+ grade, "Grade: ") );
         System.out.println(String.format("%-16s"+ studentID, "StudentID: ") );
         System.out.println(String.format("%-16s"+ login, "Login: ") );
         System.out.println(String.format("%-16s"+ schoolAverage, "SchoolAverage: ") );

         userInput.close(); 

		
	}

}
