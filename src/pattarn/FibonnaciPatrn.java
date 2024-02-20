package pattarn;

import java.sql.SQLOutput;
import java.util.Scanner;

public class FibonnaciPatrn {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the size of patrn:");
        int n=sc.nextInt();
//        for (int i=1;i<=n;i++)
//        {
//            for(int j=1;j<=i;j++)
//            {
//                System.out.print("@ ");
//            }
//            System.out.println();
//        }


        //uncomment these two line
//        int a=0;
//        int b=1;
        for (int i=1;i<=n;i++)
        {
            //one time plz comment these two line
            int a=0;
            int b=1;
            for(int j=1;j<=i;j++)
            {
                int c=a+b;
                System.out.print(c+" ");
                a=b;
                b=c;
            }
            System.out.println();
        }
    }
}
