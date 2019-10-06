//WAP To Find the  Sum of first N natural numbers

import java.util.Scanner;

public class Test8 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a Number :");
        int num = sc.nextInt();
        int sum = 0;
        if (num >= 1) {
            System.out.println("The Sum of First " + num + " Natural Number is :");
            for (int i = 1; i <= num; i++) {
                sum += i;
            }
        }
        System.out.println(sum);
    }
}