// To find Armstrong Number between two given number.

import java.util.Scanner;


public class Task9 {
    public static boolean checkArmStrong(int num){
        boolean flag =true;
        int n= countDigit(num);
        int sum=0,gum=num;
        while(gum!=0){
            int digit =gum%10;
            sum +=(int)Math.pow(digit,n);
            gum=gum/10;
        }
        if(sum!=num)
            flag=false;

        return flag;
    }
    public static int countDigit(int num){
        int count=0;
        while(num!=0){
            count++;
            num=num/10;
        }
        return count;
    }
    public static void main(String[] args){
        Scanner sc =new Scanner(System.in);
        System.out.print("Enter two number to check ArmStrong NUmber: ");
        int num1 =sc.nextInt();
        int num2 =sc.nextInt();

        System.out.println(num1 + " is ArmStrong : " + checkArmStrong(num1));
        System.out.println(num2 + " is ArmStrong : " + checkArmStrong(num2));
    }
}
