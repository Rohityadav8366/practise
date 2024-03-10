package string;

import java.util.Arrays;
import java.util.Locale;
import java.util.Scanner;

public class LengthOfString {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int i=0;
       // int n=sc.nextInt();
        System.out.println("Enter the desired String");
        String str=sc.nextLine();
       // System.out.println(str.length());

    //## logic of counting the number of char in the string;
        // and print the CHAR

//        for(i=0;i<str.length();i++)
//        {
//            System.out.print(str.charAt(i));
//
//        }
//        System.out.println("\nLength of String "+i);

    // ## we are going to convert the smaller letter char into Capital letter with both logic;

//        System.out.println(str.toLowerCase(Locale.ROOT));
//        System.out.println(str.toLowerCase());

       // System.out.println(str.toUpperCase());
        //System.out.println(str.getBytes());
//        char upperStr;
//        for( i=0;i<str.length();i++)
//        {
//            if(str.charAt(i)>='a'&&str.charAt(i)<='z')
//            {
//                upperStr= (char) (str.charAt(i)-32);
//            }
//            else
//            {
//                upperStr=str.charAt(i);
//            }
//        }

    //## concatinate two string to each other ;
//        System.out.println("Enter the second String ");
//        String str1=sc.nextLine();
       // System.out.println("Attendent the two String \n"+str+" "+str1);

    // ## String are compaire to each other;
//
//        if(str.equals(str1))
//        {
//            System.out.println(" both string are equal");
//        }
//        else
//        {
//            System.out.println("bot string are not equal");
//        }

    //## Take a subString extracting into another String

        System.out.println("Second String");
        String str1=sc.nextLine();
        System.out.println("enter the possition");
        int n=sc.nextInt();
        System.out.println("add tow String");
        byte[] byte1=str.getBytes();
        byte[] byte2=str1.getBytes();
        System.out.println(str+"  "+str1);
        System.out.println(Arrays.toString(byte2));
        System.out.println(Arrays.toString(byte1));

        //WAP to insert a string in the main string



    }
}
