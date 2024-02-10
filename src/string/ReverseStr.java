package string;

import java.util.Scanner;

public class ReverseStr {
    static void reverse(String str)
    {
        int j=1;
        for(int i=str.length()-1;i>=0;i--)
        {
            System.out.println(j+" "+str);
            j++;
        }
    }

    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the String:");
        String str=sc.nextLine();
        reverse(str);

    }
}
