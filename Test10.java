//To print the sum of first N Odd numbers

import java.util.Scanner;

public class Test10 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a Number :");
        int num = sc.nextInt();
        int sum = 0;
        if (num >= 1) {
            System.out.println("The First " + num + " odd Numbers are :");
            for (int i = 1; i <= num; i++) {
                if (i % 2 != 0) {
                    sum += i;
                }
            }
        }
        System.out.println(sum);
    }

}
