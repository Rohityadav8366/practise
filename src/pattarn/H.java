package pattarn;

import java.util.Scanner;

public class H {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        for(int i=1;i<=n;i++){
            for(int j=1;j<=n;j++)
            {
                if((j==1&&j==n)||(i==n/2))
                {
                    System.out.print("*");
                }
            }
            System.out.println();
        }
    }
}
