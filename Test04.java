//WAP To read two numbers and display its remainder without using % operator

import java.util.Scanner;

public class Test4 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter The First Number : ");
        int num1 = sc.nextInt();
        System.out.println("Enter The Second Number : ");
        int num2 = sc.nextInt();
        int remainder = num1 - (num1 / num2) * num2;

        System.out.println("Remainder is : " + remainder);
    }

}
