package array;

import java.util.Scanner;

public class sumOfEle {
    static void sumOfIndex(int sum,int[] arr)
    {
        for(int i=0;i<arr.length;i++)
        {
         sum-=arr[i];
         if(sum==0)
         {
             System.out.println("i");
         }
        }
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the size of array:");
        int n=sc.nextInt();
        System.out.println("Enter the element of array:");
        int[] arr=new int[n];
        for (int i=0;i<n;i++)
        {
            arr[i]=sc.nextInt();
        }
        System.out.println("sum of two any index:");
        int sum=sc.nextInt();
        sumOfIndex(sum,arr);
    }
}
