//WAP to display Sum of Factorial of individual digits available in given number?

import java.util.Scanner;

public class Test17 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a Number : ");
        int num = sc.nextInt();
        int sum = 0;
        while (num != 0) {
            int fact = 1;
            int digit = num % 10;
            for (int i = 1; i <= digit; i++) {
                fact = fact * i;
            }
            sum = sum + fact;
            num = num / 10;
        }
        System.out.println("Sum of factorial of  digits    " + sum);
    }
}
