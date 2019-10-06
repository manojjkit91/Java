//WAP to check given number is prime or not

import java.util.Scanner;


public class Test21 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a Number : ");
        int num = sc.nextInt();
        boolean flag = true;
        for(int i=2;i<num;i++){
        if(num%i==0){
        flag=false;
        break;
        }
        }
        if(flag){
            System.out.println("The given number is prime : "+num);
        }
        else
        {
            System.out.println("The Given Nubmer is not Prime!!"+num);
        }
        
       
    }
}
