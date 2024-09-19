package ANR;

import java.util.Scanner;

public class ProString {

//char from string
        public static void reverseString(String str) {
            char[] chArr= str.toCharArray();
            StringBuffer sb=new StringBuffer(str);
            StringBuilder stringBuilder=new StringBuilder(str);
            for (int i = str.length() - 1; i >= 0; i--) {
//                System.out.print(chArr[i]);
//                System.out.print(str.charAt(i));
            }
            System.out.println(sb.reverse());

            System.out.println(stringBuilder.reverse());

        }
//Pallindrom string
    public static void pallindrome(String str)
    {
        char[] chArr=new char[str.length()];
        char ch = 0;
        for(int i=str.length()-1;i>=0;i--)
        {
              ch =str.charAt(i);
        }
        for(int i=0;i<str.length();i++){
            chArr[i]=ch;
        }
        System.out.println(str);
        System.out.println(chArr);
    }

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String str=sc.nextLine();
        pallindrome(str);
    }
}
