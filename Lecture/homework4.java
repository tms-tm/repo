/*
Read two double values, then an operator character: +, -, * or /.

Use classic switch to calculate the result.
For division by zero, print Cannot divide by zero.
For another operator, print Invalid operator

Input: num1, num2, operand
Process:
- Determine if num2 is zero with case operand of / to return error
- Determine result based on num1, num2, operand
Output: result
*/

import java.util.Scanner;

public class homework4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Enter two numbers: ");
        double num1 = sc.nextDouble();
        double num2 = sc.nextDouble();

        System.out.print("Enter the operand: ");
        char operand = sc.next().charAt(0);

        switch(operand) {
            case('+'):
            System.out.println(num1+num2);
            break;

            case('-'):
            System.out.println(num1-num2);
            break;
            
            case('*'):
            System.out.println(num1*num2);
            break;
    
            case('/'):
            if(num2==0) {
                System.out.print("Cannot divide by zero");
            }
            else {
                System.out.println(num1/num2);
            }
            break;
            
            default:
            System.out.print("Invalid operator");
        
    }
        sc.close();
    }
}