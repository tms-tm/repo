/*
Read a positive integer year.
Print Invalid if the year is not positive.

Use the Gregorian rule for this exercise:
A year is a leap year if divisible by 400, or divisible by 4 but not by 100.

Print Leap year or Common year

Input: year
Process: Determine typeOfYear based on whether or not it is divisible by 4, 100, 400
Output: typeOfYear

*/
import java.util.Scanner;
public class homework2 {
    public static void main(String[] args) {

        String typeOfYear;
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter year (Positive Integer): ");
        int year = sc.nextInt();

        if (year<=0) {
            System.out.print("Invalid");
        }
        else {
        if ((year%400==0)||((year%4==0))&&!(year%100==0)) {
            typeOfYear = "Leap year";
        }
        else {
            typeOfYear = "Common year";
        }
            System.out.print(typeOfYear);
    }

        sc.close();
    }
}
