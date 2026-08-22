// Take 2 numbers as input and print the largest number.


import java.util.Scanner;
public class Task5 {
    public static void main(String[] args){
        Scanner sc =new Scanner(System.in);
        System.out.print("Enter the two Number for compare : ");
        int a =sc.nextInt();
        int b =sc.nextInt();

        if(a>b){
            System.out.println( a + " is Greater than "+ b);
        }else{
            System.out.println( b + " is Greater than "+ a);
        }
    }
}
