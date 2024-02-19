package pattarn;

import java.sql.SQLOutput;
import java.util.Scanner;

public class Normlpat {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the size of element:");
        int n=sc.nextInt();
        int count=1;
        for(int i=1;i<=n;i++)
        {
            for(int j=1;j<=n;j++)
            {
               /*normaly simple pattern
               * 5 row and 5 coloum
               * */
                //System.out.print("$ ");
                /*
                * here simple pattern n by n made
                * the int is increasing in number*/
                System.out.print(count+" ");
                count++;
            }
            System.out.println();
        }
    }
}
