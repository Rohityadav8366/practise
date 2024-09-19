package ANR;

import java.util.Scanner;

public class ProString {

//char from string
        public static void stringToChar(String str) {
            for (int i = str.length() - 1; i >= 0; i--) {
                System.out.print(str.charAt(i));
            }
        }
//Pallindrom string
    public static void pallindrome(String str)
    {
        String str1="";
        for(int i=str.length()-1;i>0;i--)
        {
             str1 = String.valueOf(str.charAt(i));
        }
        System.out.println(str);
        System.out.println(str1);
    }

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String str=sc.nextLine();
        stringToChar(str);
    }
}
