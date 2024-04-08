package DSA;

import java.util.Scanner;

public class SubArray {
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int[] arrA=new int[n];
        int[] arrB=new int[n];
        int[] subarr=new int[n];
        for(int i=0;i<n;i++)
        {
            arrA[i]=sc.nextInt();
        }
        for(int i=0;i<n;i++)
        {
            arrB[i]=sc.nextInt();
        }
        for(int i=0;i<arrA.length-1;i++)
        {
             subarr[i]=arrA[i];

        }
    }
}
