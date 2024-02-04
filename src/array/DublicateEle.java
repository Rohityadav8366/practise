package array;

import java.util.Scanner;

public class DublicateEle {
    static void dublicate(int[] arr)
    {int m=arr[0];
        for(int i=0;i< arr.length;i++)
        {
         if(arr[i+1]==m)
         {
             System.out.println("there is dublicate element:"+arr[i+1]);
         }
         m=arr[0]++;
        }
    }

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the size of array:");
        int n=sc.nextInt();
        int[] arr=new int[n];
        System.out.println("Enter the element:");
        for (int i=0;i<n;i++)
        {
            arr[i]=sc.nextInt();
        }
        dublicate(arr);
    }
}
