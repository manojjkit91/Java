//WAP to check palindrome or not

import java.util.Scanner;

public class Test19 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a Number : ");
        int num = sc.nextInt();
        int sum = 0;
        int temp = num;
        while (num != 0) {
            int rem = num % 10;
            sum = sum * 10 + rem;
            num = num / 10;
        }
        if (temp == sum) {
            System.out.println("The given number is a Palindrome number :  " + temp);
        } else {
            System.out.println("The given number is not a palindrome number:   " + temp);
        }
    }
}
