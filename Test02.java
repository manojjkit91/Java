//Sum of Two numbers without using + operator

import java.util.Scanner;

public class Test2 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter The First Number : ");
        int num1 = sc.nextInt();
        System.out.println("Enter The Second Number : ");
        int num2 = sc.nextInt();
        int carry;
        while (num2 != 0) {
            carry = num1 & num2;
            num1 = num1 ^ num2;
            num2 = carry << 1;
        }
        System.out.println("Sum is : " + num1);
    }

}
