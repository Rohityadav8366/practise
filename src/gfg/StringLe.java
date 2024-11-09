package gfg;

import java.util.Scanner;

public class StringLe {

    public static void reverseString(){
        Scanner sc=new Scanner(System.in);
        String str=sc.nextLine();
        StringBuffer str1=new StringBuffer(str);
        System.out.println(str1.reverse());
    }

    public static void main(String[] args) {
        reverseString();
    }
}
