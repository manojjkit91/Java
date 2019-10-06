//WAP to reverse a number

import java.util.Scanner;

public class Test18 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a Number : ");
        int num = sc.nextInt();
        int sum = 0;
        int temp = num;
        while (num != 0) {
            int rem = num % 10;
            sum = sum*10 + rem; 
            num = num / 10;
        }
        System.out.println("The given number is :  " + temp);
        System.out.println("The reverse number is :   " + sum);
    }
}
