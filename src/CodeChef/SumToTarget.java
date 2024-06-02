package CodeChef;

import java.util.Scanner;

public class SumToTarget {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int tar=sc.nextInt();
        int[] arr=new int[n];
        int sum=0;
        for(int i=0;i<n;i++)
        {
            arr[i]=sc.nextInt();
        }
        for(int i=0;i< arr.length;i++)
        {
            for(int j=i+1;j< arr.length;j++)
            {
                sum=arr[i]+arr[j];
                if(sum==tar)
                {
                    System.out.println("["+i+","+j+"]");
                }
            }
        }
    }
}
