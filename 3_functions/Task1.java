// Define a method to find out if a number is prime or not.

import java.util.Scanner;

public class Task1{
    public static void checkPrime(int n){
        if(n<=1){
            System.out.println("Entered Number is NOOOOOT Prime");
            return;
        }
        for(int i=2;i<=Math.sqrt(n);i++){
            if(n%i==0){
                System.out.println("Entered Number is NOOOOOT Prime");
                return; 
            }
        }
        System.out.println("Entered Number is PPPPPPPrime");


    }
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        System.out.print("Enter number to check wheather its prime or not: ");
        int n =sc.nextInt();

        checkPrime(n);
    }
}
