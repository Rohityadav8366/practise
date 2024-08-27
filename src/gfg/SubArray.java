package gfg;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Scanner;

public class SubArray {
    public static void subarraySum(int[] arr, int n, int s)
    {
        while(true) {
            int sum = 0;
            int start = 0;
            int i;
            for ( i = 0; i < n; i++) {
                if (sum == 0) {
                    start = i + 1;
                }
                sum = sum + arr[i];
                if (sum == s) {
                    System.out.println(start + "," + i);
                }
            }
            if (sum > s) {
                sum = 0;
                i = start;
                start = 0;
            }
            else {//vgdfgdfousax
                System.out.println("-1");
                System.exit(0);
            }
        }
    }

    public static void main(String[] args) {

        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int s=sc.nextInt();
        int[] arr=new int[n];
        for(int i=0;i<n;i++)
        {
            arr[i]=sc.nextInt();
        }
        subarraySum(arr,n,s);
    }
}
