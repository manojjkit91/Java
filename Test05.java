//WAP To print first N natural numbers

import java.util.Scanner;

public class Test5 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a Number :");
        int num = sc.nextInt();
        if (num >= 1) {
            System.out.println("The First " + num + " Natural Numbers are :");
            for (int i = 1; i <= num; i++) {
                System.out.print(i+"  ");
            }
        }
        System.out.println();
    }

}
