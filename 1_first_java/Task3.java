// Write a program to input principal, time, and rate (P, T, R) from the user and find Simple Interest.


import java.util.Scanner;

public class Task3 {
    public static void main(String[] args){
        Scanner sc =new Scanner(System.in);
        System.out.print("Enter Principal Amount for SI : ");
        int p=sc.nextInt();
        System.out.print("Enter Rate  for SI : ");
        float r=sc.nextFloat();
        System.out.print("Enter Time in Years for SI : ");
        int t =sc.nextInt();

        System.out.println("Simple Interest is : " + (p*r*t)/100);
    }
}
