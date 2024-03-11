package string;

import java.util.Scanner;

public class DuplicateString {
    public static void main(String[] args) throws Exception
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the String :");
        String str=sc.nextLine();
//        String rem="";
//        System.out.println("Duplicate Char ");
//        for(int i=0;i<str.length()-1;i++)
//        {
//            for(int j =i+1;j<str.length(); j++)
//            {
//                if (str.charAt(i)==str.charAt(j)) {
//                    str+=str.charAt(i)-str.charAt(j);
//
//                    System.out.print(str.charAt(i));
//                    break;
//                }
//            }
//
//        }
//        System.out.println(str);



        // Using StringBuffer to remove duplicate char
        System.out.println("After removing Duplicate charactor");
        StringBuffer dup=new StringBuffer();
        for(int i=0;i<str.length();i++)
        {
            char current=str.charAt(i);
            if (dup.indexOf(String.valueOf(current)) == -1) {
                dup.append(current);
            }
        }
        System.out.println(dup.toString());
    }
}
