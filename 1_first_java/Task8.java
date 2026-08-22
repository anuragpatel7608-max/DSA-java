// To find out whether the given String is Palindrome or not.


import java.util.Scanner;

public class Task8 {
    public static void palindromeCheckString(String str){
        int i=0;
        int j=str.length() - 1;
        while(i<j){
            if(str.charAt(i) != str.charAt(j)){
                System.out.println("Not a palindrome String");
                break;
            }else{
                i++;
                j--;
            }
        }
        System.out.println(str +" is a palindrome String -------Right");
    }
    public static void main(String[] args){
        Scanner sc =new Scanner(System.in);
        System.out.print(" Enter String: ");
        String str =sc.next();

        palindromeCheckString(str);
    }
}
