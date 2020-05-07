package test;
import java.util.*;
public class Grade {
 public static void main() 
 {
	 Scanner sc= new Scanner(System.in);
	 System.out.println("Enter the Marks of a Student");
	 int mark=sc.nextInt();
	 if(mark>90)
		 System.out.println("Grade is A");
	 else if(mark>80 && mark<90)
		 System.out.println("Grade is B");
	 else if(mark>70 && mark<80)
		 System.out.println("Grade is C");
	 else if(mark>60 && mark<70)
		 System.out.println("Grade is D");
	 else
		 System.out.println("Grade id F");
	 
 }
}
