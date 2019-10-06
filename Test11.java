//To print first N Even numbers

import java.util.Scanner;

public class Test11 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a Number :");
        int num = sc.nextInt();
        if (num >= 1) {
            System.out.println("The First " + num + " Even Numbers are :");
            for (int i = 1; i <= num; i++) {
                if (i % 2 == 0) {
                    System.out.println(i);
                }
            }
        }
    }

}
