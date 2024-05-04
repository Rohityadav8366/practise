package string;

import java.util.Arrays;
import java.util.Scanner;

public class EmbraseString {
    public static void main(String[] args) {
       Scanner sc=new Scanner(System.in);
       String str1=sc.nextLine();
       String str2=sc.nextLine();
        String str=str1+str2;
        StringBuffer dup=new StringBuffer();

        for(int i=0;i<str.length();i++)
        {
            char current=str.charAt(i);
            if (dup.indexOf(String.valueOf(current)) == -1) {
                dup.append(current);
            }
        }
        System.out.println(dup.toString());
        if(true)//code error
        {
            System.out.println("yes both are same");
        }
        else {
            System.out.println("no");
        }
    }
}
