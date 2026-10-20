/*
Read two integers a and b.

Use ?: to choose the smaller value.
Use another ?: to choose Even or Odd for that value.

Print the smaller number and its parity.


Input: a, b
Process:
- Determine smallerValue based on a and b entered by user
- Determine parity whether even or odd based on smallerValue
Output: parity, smallerValue
*/

import java.util.Scanner;

public class homework6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Enter a: ");
        int a = sc.nextInt();

        System.out.print("Enter b: ");
        int b = sc.nextInt();

        int smallerValue = (a < b) ? a : b;
        String parity =  ((smallerValue%2==0) ? "Even" : "Odd");
        System.out.print(smallerValue + " " + parity);
        sc.close();
    }
}