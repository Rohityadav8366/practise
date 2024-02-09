package array;

import java.util.Scanner;

public class LinearSearch {
    static void linearSear(int search,int[] arr)
    {
        for(int i=0;i<arr.length;i++)
        {
            if(arr[i]==search)
            {
                System.out.println("Element present :"+ i+" :"+search);
            }

        }

    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the size of array:");
        int n=sc.nextInt();
        System.out.println("Enter the element of array");
        int[] arr=new int[n];
        for(int i=0;i<n;i++)
        {
            arr[i]=sc.nextInt();
        }
        System.out.println("Enter the element you want to search:");
        int search=sc.nextInt();
        linearSear(search,arr);
    }
}
