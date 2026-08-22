// To calculate Fibonacci Series up to n numbers.

import java.util.Scanner;

public class Task7 {

    public static void printSeries(int n){
        int prev=0;
        int next=1;
        int sum;
        for(int i=1;i<=n;i++){
            if(i==1){
                System.out.print(prev + " ");
            }else if(i==2){
                System.out.print(next + " ");
            }else{
                sum=prev+next;
                System.out.print(sum + " ");
                prev=next;
                next=sum;
            }
        }
    }
    public static void main(String[] args){
        Scanner sc =new Scanner(System.in);

        System.out.print("Enter number upto fabinaco series: ");
        int n =sc.nextInt();

        if(n>0)
            printSeries(n);
        else
            System.out.println("Enter valid number ");
    }
}
