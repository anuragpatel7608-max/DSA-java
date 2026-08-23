// Factorial Program In Java

import java.util.Scanner;

public class Task1 {
    public static int factorial(int n) {
        // code here
        if(n==0 || n==1)
            return 1;
        else{
            int sum=1;
            for(int i=2;i<=n;i++){
                sum *=i;
            }
            return sum;
        }
    }

    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        System.out.print("Enter number to calculate the factorial:  ");
        int n =sc.nextInt();
        System.out.println("Answer: " + factorial(n));
    }
}

