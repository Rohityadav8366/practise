package array;

import java.util.Scanner;

public class SecondAndThirdMax {
    static void secMax(int[] arr)
    {
        int i=0,sec=0,max=0,third=0;
        for (i=0;i< arr.length;i++)
        {
            if(max<arr[i])
            {
                third=sec;
                sec=max;
                max=arr[i];
            } else if (sec<arr[i]&&arr[i]!=max)
            {
                sec=arr[i];
            } else if (third<arr[i]&&arr[i]!=sec)
            {
                third=arr[i];
            }
        }
        System.out.println("maximum number of element: "+max);
        System.out.println("second max element of array: "+sec);
        System.out.println("third max element of array: "+third);
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
        secMax(arr);
    }
}
