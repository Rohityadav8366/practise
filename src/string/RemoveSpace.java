package string;

import java.util.Scanner;

public class RemoveSpace {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the String ");
        String str=sc.nextLine();
        for(int i=0;i<str.length();i++)
        {
            if("_".equals(str.charAt(i)))
            {
                continue;
            }
            System.out.print(str.charAt(i));
        }
    }
}
