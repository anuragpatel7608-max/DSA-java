// Calculate Electricity Bill

// Units consumed	Rate per unit
// 0–100	₹2
// 101–200	₹3
// 201–400	₹5
// Above 400	₹7

import java.util.Scanner;

public class Task2 {

    public static int calBill(int u){
        int cost=0;
        switch (u<=100 ? 0:u<=200?1:u<=400?2:3) {
            case 0:
                cost=u*2;
                break;
            case 1:
                cost=u*3;
                break;
            case 2:
                cost=u*5;
                break;
            case 3:
                cost=u*7;
                break;
        }
        return cost;
    }
    public static void main(String[] args){
        Scanner sc =new Scanner(System.in);
        System.out.print("Enter the unit consume to calculate the Electricity bill: ");
        int u =sc.nextInt();

        System.out.println("Bill is : ₹" + calBill(u));
         
    }
}
