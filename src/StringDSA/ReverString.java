package StringDSA;

import java.util.Scanner;

public class ReverString {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the size of charactor:");
       char[] ch=sc.nextLine().toCharArray();
        for(int i= ch.length-1;i>=0;i--)
        {
        System.out.print(ch[i]);
        }
    }
}
