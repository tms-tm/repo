/*
Read an integer mark.
Reject marks outside 0 to 100.

Apply these exercise rules:
80–100: A
65–79: B
50–64: C
0–49: F

Print the grade or Invalid

Input: mark
Process:
- Determine whether to reject mark based on mark entered by user and whether it is outside 0 to 100
- Determine grade whether it is A, B, C or F based on mark entered by user
Output: grade

Explain why validation comes before grade thresholds:
Because if the number is not within the range of 0 to 100, then the rest of the code would not have to run as it is already invalid

*/
import java.util.Scanner;
public class homework1 {
    public static void main(String[] args) {

        char grade;
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter mark: ");
        int mark = sc.nextInt();
        if (mark<0 || mark>100) {
            System.out.println("Invalid");
        }
        else {
            if (mark>=80) {
                grade = 'A';
            }
            else if (mark>=65) {
                grade = 'B';
            }
            else if (mark>=50) {
                grade = 'C';
            }
            else {
                grade = 'F';
            }
            System.out.println(grade);
        }

        sc.close();
    }
}
