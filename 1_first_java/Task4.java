// Take in two numbers and an operator (+, -, *, /) and calculate the value. (Use if conditions)


import java.util.Scanner;
public class Task4 {
    public static void operations(float a,float b ,String op){
        if(op.equals("*")){
            System.out.println("operation " + a + " * " + b + " => " + (a*b) );
        }else if(op.equals("/")){
            System.out.println("operation " + a + " / " + b + " => " + (a/b) );
        }else if(op.equals("+")){
            System.out.println("operation " + a + " + " + b + " => " + (a+b) );
        }else{
            System.out.println("operation " + a + " - " + b + " => " + (a-b) );
        }
    } 
    public static void main(String[] args){
        Scanner sc =new Scanner(System.in);
        System.out.print("Enter the operator that you wana perform ( * ,/ , + ,- )  : ");
        String op =sc.next();
        // System.out.println(op);
        
        System.out.print("Enter the first oprents that you wana perform between  : ");
        float a =sc.nextFloat();

        System.out.print("Enter the second oprents that you wana perform between  : ");
        float b =sc.nextFloat();

        operations(a,b,op);

    }
}
