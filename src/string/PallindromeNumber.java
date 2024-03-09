package string;

import java.util.Scanner;

public class PallindromeNumber {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the Word");
        String str= sc.nextLine();
        String str1="";
        for(int i=str.length()-1;i>=0;i--)
        {
            str1+= str.charAt(i);
            //System.out.print(str1);
        }
        if(str.equals(str1))
        {
            System.out.println("Pallindrome String");
        }
        else
        {
            System.out.println("NOT pallindrome String");
        }
    }
}
