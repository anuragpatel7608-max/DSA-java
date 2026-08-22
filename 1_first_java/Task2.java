// Take name as input and print a greeting message for that particular name.


import java.util.Scanner;

public class Task2 {
    public static void main(String[] args){
        Scanner sc =new Scanner(System.in);
        System.out.print("Enter your name:  ");
        String name =sc.next();
        // String name =sc.nextLine();

        System.out.println("Good Evening " + "\""+ name +"\"");

    }
}
