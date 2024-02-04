package array;

import java.util.Scanner;

public class SumofElement {
    static void sumOfEle(int m,int[] arr)
    {
        int sum=0;
        for(int i=0;i< arr.length;i++)
        {
            sum+=arr[i];
            if(m==arr[i])
            {
                System.out.println("the element present at the position "+i+" number is: "+m);
            }
        }
        System.out.println("Sume of all element: "+sum);
    }

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the size of element:");
        int n=sc.nextInt();
        int[] arr=new int[n];
        System.out.println("Enter the element:");
        for(int i=0;i<n;i++)
        {
            arr[i]=sc.nextInt();
        }
        System.out.println("Enter the element which you have search:");
        int m= sc.nextInt();
        sumOfEle(m,arr);
    }
}
