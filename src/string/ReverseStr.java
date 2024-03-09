package string;

import java.util.Scanner;

public class ReverseStr {
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the String:");
        String str=sc.nextLine();
        System.out.println("Rverse String ");
        for(int i=str.length()-1;i>=0;i--) {
            System.out.print(str.charAt(i));
        }
    }
}
