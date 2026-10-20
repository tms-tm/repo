/*
Read age as an integer and student status as a word (yes or no).

Accept ages 0 to 120. Reject any other age or status.

Compare status ignoring case.

Under 12 or at least 60: RM8.

Otherwise, student: RM10.

Otherwise: RM15.

Input: age, studentStatus
Process:
- Determine whether or not age is accepted within the range of 0 to 120 based on age entered by user
- Determine ticketPrice either RM8, RM10 or RM15 based on age entered by user and studentStatus
Output:
ticketPrice
*/
import java.util.Scanner;
public class homework3 {
 public static void main(String[] args) {
   Scanner sc = new Scanner(System.in);

   int ticketPrice = 0;
   System.out.print("Enter age: ");
   int age = sc.nextInt();
   System.out.print("Are you a student? ");
   String studentStatus = sc.next();
   if (age < 0 || age > 120 || !(studentStatus.equalsIgnoreCase("yes") || studentStatus.equalsIgnoreCase("no"))) {
     System.out.print("Invalid");
   }
   else {
     if ((age<12)||(age>=60)) {
     ticketPrice = 8;
   }
     else if (studentStatus.equalsIgnoreCase("yes")) {
     ticketPrice = 10;
   }
     else {
     ticketPrice = 15;
   }
     System.out.println(ticketPrice);
  }
  sc.close();
 }
}
