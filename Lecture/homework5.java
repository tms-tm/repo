/*
Read two single-word names.

If they are equal ignoring case, print Same name.
Otherwise print them in lexicographic order ignoring case.

Preserve the original spelling when printing

Input: name1, name2
Process:
- Determine comparisonValue based on name1, name2
- Determine if name1 is equal to name2 based on comparisonValue
- Determine if name1 comes before name2 in lexicographic order based on comparisonValue
Output: Same name OR name1 name2 OR name2 name1
*/

import java.util.Scanner;

public class homework5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Enter name 1: ");
        String name1 = sc.next();

        System.out.print("Enter name 2: ");
        String name2 = sc.next();
        int comparisonValue = name1.compareToIgnoreCase(name2);

        if (comparisonValue==0) {
            System.out.print("Same name");
        }
        else if (comparisonValue>0) {
            System.out.print(name2 + " " + name1);
        }
        else {
            System.out.print(name1 + " " + name2);
        }
        sc.close();
    }
}