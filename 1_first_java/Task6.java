// Input currency in rupees and output in USD.

import java.util.Scanner;
public class Task6 {
    public static void main(String[] args){
        Scanner sc =new Scanner(System.in);
        System.out.print("Enter the Amount in (Ruppes) to convert into Dollar ($):");
        int val =sc.nextInt();

        // System.out.println(val +" Ruppes is => $" +  (val/95.66));
        System.out.printf(val +" Ruppes is => $" +  "%.2f%n",(val/95.66));
       
    }
}
