package array;

import java.util.Scanner;

public class MaxElement {
    static void maxelement(int n,int[] arr)
    {int secMax=0, i=0;

        int max=0;
        for( i=0;i< arr.length;i++)
        {
            if(max<arr[i])
            {
                secMax=max;
                max=arr[i];
            } else if (secMax<arr[i]&&arr[i]!=max)
            {
                secMax=arr[i];
            }
        }
        System.out.println("Maximum number of element: "+max);
        System.out.println("Second max number of element:"+secMax);
    }

    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the size of array:");
        int n=sc.nextInt();
        System.out.println("Enter the Element of Array:");
        int[] arr=new int[n];
        for(int i=0;i<n;i++)
        {
            arr[i]= sc.nextInt();
        }
        maxelement(n,arr);

    }
}
