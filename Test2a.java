//Sum of Two numbers without using + operator

import java.util.Scanner;

public class Test2a {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter The First Number : ");
        int num1 = sc.nextInt();
        System.out.println("Enter The Second Number : ");
        int num = sc.nextInt();
        int carry;
        while (num-- != 0) {
            num1++;
        }
        System.out.println("Sum is : " + num1);
    }

}
