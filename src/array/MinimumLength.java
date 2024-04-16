package array;

import java.util.Scanner;

public class MinimumLength {
    public static int minLength(int[] arr,int[] arr1,int n)
    {
        int result=0;
        int[] subarr=new int[n-1];
        for(int i=0;i< arr.length;i++)
        {
            if(arr[i]>arr[i+1]) {
                subarr[i] = arr[i];
            }
         }
        return result;
    }

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the size of array :");
        int n=sc.nextInt();
        System.out.println("Enter the element of array :");
        int[] arr=new int[n];
        int[] arr1=new int[n];
        for(int i=0;i<n;i++)
        {
            arr[i]=sc.nextInt();
        }
        for(int i=0;i<n;i++)
        {
            arr1[i]=sc.nextInt();
        }
        minLength(arr,arr1,n);
    }
}
