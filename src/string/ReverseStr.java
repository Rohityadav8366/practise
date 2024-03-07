package string;

import java.util.Scanner;

public class ReverseStr {
    static void reverse(char[] ch)
    {

        for(int i=ch.length-1;i>=0;i--)
        {
            System.out.println(" "+ch);
        }
    }

    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the String:");
        char[] ch=new char[10];
        for(int i=0;i<10;i++) {
            ch[i] = sc.next().charAt(10);
        }

        reverse(ch);

    }
}
