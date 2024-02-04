package string;

import java.util.Scanner;

public class PrintString {
    static void printStr(String str)
    {
        System.out.println(str);
        System.out.println("Length of String: "+str.length());
        System.out.println(str);
    }

    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the String:");
        String str=sc.nextLine();
        printStr(str);
    }
}
