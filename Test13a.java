// WAP to display digits available in given number

import java.util.Scanner;


public class Test13a {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a Number : ");
        int num = sc.nextInt();
        LabTest13a a = new LabTest13a();
        dig(num);
    }
 public static void dig(int n) {        
        if (n != 0) 
        {
            int digit = n % 10;
            dig(n/ 10);
            System.out.println(digit);
        }
    }
 }

  