package LeetCode;

import java.util.Scanner;

public class TwoSum {
    public static int[] twoSum(int[] arr, int tar)
    {
      int sum=0;
      for(int i=0;i< arr.length;i++)
      {
        for(int j=i+1;j< arr.length;j++)
        {
            sum=arr[i]+arr[j];
            if(sum==tar)
            {
                return new int[]{i,j};
            }
        }
      }
        return null;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int tar=sc.nextInt();
        int[] arr=new int[n];
        for(int i=0;i<n;i++)
        {
            arr[i]=sc.nextInt();
        }
        System.out.println(twoSum(arr,tar));
    }
}
