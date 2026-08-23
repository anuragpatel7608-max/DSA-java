import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        System.out.print("Enter radius of circle for area:  ");
        float r =sc.nextFloat();

        System.out.println("Area of circle with radius " + r + " is : " + 3.14*r*r);

    }
}
