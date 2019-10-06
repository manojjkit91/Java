// WAP to display digits available in given number

import java.util.Scanner;


public class Test13 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a Number : ");
        int num = sc.nextInt();
        while(num!=0){
        int digit = num%10;
            System.out.println(digit);
            num=num/10;
        }
    }
    
}
