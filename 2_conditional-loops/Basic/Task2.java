import java.util.Scanner;

public class Task2 {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        System.out.print("Enter base of triangle for area:  ");
        int b =sc.nextInt();
        System.out.print("Enter height of triangle for area:  ");
        int h =sc.nextInt();

        System.out.println("Area of triangle with height " + h + " and base "+ b +" is : "+ (h*b)/2);

    }
}
