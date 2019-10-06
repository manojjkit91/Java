//WAP to read two numbers and display its Quotient without using / operator

import java.util.Scanner;

public class Test3 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter The First Number : ");
        int num1 = sc.nextInt();
        System.out.println("Enter The Second Number : ");
        int num2 = sc.nextInt();
        int quotient = 0;
        while (num1 >= num2) {
            num1 -= num2;
            quotient++;
        }

        System.out.println("Quotient is : " + quotient);
    }
}
