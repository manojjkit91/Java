//WAP to display number of even and odd digits available in given number?

import java.util.Scanner;

public class Test14 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a Number : ");
        int num = sc.nextInt();
        int even = 0, odd = 0, Zeros = 0;
        while (num != 0) {
            int digit = num % 10;
            if (digit != 0) {
                if (digit % 2 == 0) {
                    even++;
                } else {
                    odd++;
                }
            } else {
                Zeros++;
            }
            num = num / 10;
        }
        System.out.println("Total number of Even digits" + even);
        System.out.println("Total number of Odd digits" + odd);
        System.out.println("Total number of Zeros digits" + Zeros);
    }

}
