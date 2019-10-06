//Swap Two Nubmers Without using Third variables or
//Swap Two numbers using Bitwise Operators

import java.util.Scanner;

public class Test1a {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter First Number : ");
        int num1 = sc.nextInt();
        System.out.println("Enter Second Number : ");
        int num2 = sc.nextInt();
        System.out.println("Before Swap Num1 " + num1 + " and Num2 " + num2);
        num1 ^= num2;
        num2 ^= num1;
        num1 ^= num2;
        System.out.println("After Swap Num1 " + num1 + " and Num2 " + num2);
    }

}
