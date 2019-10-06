//WAP to display Sum of square/Cubes of individual digits available in given number?

import java.util.Scanner;

public class Test16 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a Number : ");
        int num = sc.nextInt();
        int sum = 0, sum1 = 0;
        while (num != 0) {
            int digit = num % 10;
            sum = sum + (digit * digit); //Sum of Square of digits
            sum1 = sum1 + (digit * digit * digit);// Sum of Cubes of digits
            num = num / 10;
        }
        System.out.println("Sum of Square of  digits    " + sum);
        System.out.println("Sum of Cubes of  digits    " + sum1);
    }
}
