package CodeChef;

import java.util.Scanner;

public class ChefAndString {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int count=0;
        System.out.println("enter the value of n:");
        int n=sc.nextInt();
        System.out.println("Enter the string:");
        sc.nextLine();
        String str=sc.nextLine();
        for(int i=0;i<=n-1;i++)
        {
            if(str.charAt(i)!=str.charAt(i+1))
            {
                count++;
            }
            i++;
        }
        System.out.println(count);
    }
}
