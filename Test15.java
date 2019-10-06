//WAP to display Sum of even digits and sum of  odd digits available in given number?

import java.util.Scanner;

public class Test15 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a Number : ");
        int num = sc.nextInt();
        int even = 0, odd = 0, Zeros = 0;
        while (num != 0) {
            int digit = num % 10;
            if (digit != 0) {
                if (digit % 2 == 0) {
                    even +=digit;
                } else {
                    odd +=digit;
                }
            } 
            num = num / 10;
        }
        System.out.println("Sum of Even digits" + even);
        System.out.println("Sum of Odd digits" + odd);
    }

}
