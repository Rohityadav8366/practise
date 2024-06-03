package CodeChef;

import java.util.Scanner;

public class CardSwap {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the value of n");
        int n=sc.nextInt();
        int[] arr=new int[n];
        int [] arr1=new int[n];
        int count=1;
        System.out.println("Enter the element");
        for(int i=0;i<n;i++)
        {
            arr[i]= sc.nextInt();
        }
        for(int i=0;i<arr.length-1;i++)
        {
            if(arr[i]!=arr[i+1])
            {
                arr1[i]=arr[i];
            }
            System.out.println(arr1[i]);
        }
        System.out.println(count);
    }
}
