package string;

import java.util.Arrays;
import java.util.Scanner;

public class AnagramString {
    public static void main(String[] args) {
       Scanner sc=new Scanner(System.in);
        System.out.println("Enter the String1:");
       String str1=sc.nextLine();
        System.out.println("Enter the String2 :");
        String str2=sc.nextLine();
       char[] char1=str1.toCharArray();
       char[] char2=str2.toCharArray();
       Arrays.sort(char1);
       Arrays.sort(char2);
       String sortStr1=new String(char1);
       String sortStr2=new String(char2);
        System.out.println(sortStr1);
        System.out.println(sortStr2);
        if(sortStr1.equals(sortStr2))
        {
            System.out.println("equal string");
        }
        else {
            System.out.println("Not equal String");
        }
    }
}
