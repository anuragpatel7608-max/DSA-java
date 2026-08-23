// Reverse A String In Java

import java.util.Scanner;


public class Task3 {
    public static String reverse(String s){
        int c =-1;
        while(true){
            try{
                c++;
                s.charAt(c);
            }catch(StringIndexOutOfBoundsException e){
                c--;
                break;
            }
        }
        int i=0;
        int cond=(c+1)/2;
        char[] ss=s.toCharArray();
        while(i<cond){
            char swap=ss[i];
            ss[i]=ss[c];
            ss[c]=swap;
            i++;
            c--;
        }
        return String.valueOf(ss);
    }
    public static void main(String[] args){
        Scanner sc =new Scanner(System.in);
        System.out.print("Enter the string and get its reverse: ");
        String s=sc.next();
       
        System.out.println("reverse String is : " + reverse(s));
    }
}
