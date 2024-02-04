package filehand;

import java.util.Scanner;

public class ArmstrongNo {
    static void armstrong(int n)
    {   int b=0;
        int c=n;
        int l = String.valueOf(n).length();

        while(!(n==0))
        {
             int a=n%10;
            b += (int) Math.pow(a, l);
             n=n/10;
        }
        if(c==b)
        {
            System.out.println("Armstrong Number: "+b);
        }
        else
            System.out.println("Not Armstrong no.: "+b);
    }

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number");
        int n=sc.nextInt();
        armstrong(n);
    }
}
