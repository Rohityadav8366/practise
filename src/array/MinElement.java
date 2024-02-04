package array;

import java.util.Scanner;

public class MinElement {
    static void min(int[] arr)
    {
        int i=0,minimum=arr[i];
        for(i=0;i<arr.length;i++)
        {
            if(minimum>arr[i])
            {
                minimum=arr[i];
            }
        }
        System.out.println("Minimum number:"+minimum);
    }

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the size of element");
        int n=sc.nextInt();
        int[] arr=new int[n];
        System.out.println("Enter the element:");
        for(int i=0;i<n;i++)
        {
            arr[i]=sc.nextInt();
        }
        min(arr);
    }
}
