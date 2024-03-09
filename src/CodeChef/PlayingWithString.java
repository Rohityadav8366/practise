package CodeChef;

import java.util.Scanner;

public class PlayingWithString {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int i=0,count=0;
        System.out.println("Enter the size of array");
        int n=sc.nextInt();
        int[] arr=new int[n];
        System.out.println("Enter the element ");
        for( i=0;i<n;i++)
        {
            arr[i]=sc.nextInt();
        }
        int[] arr1=new int[n];
        System.out.println("Enter the desired element");
        for( i=0;i<n;i++)
        {
            arr1[i]=sc.nextInt();
        }
        for(i=0;i<arr.length;i++)
        {
            if(i==0||i==n-1)
            {
                if(arr[i]==0)
                {
                    arr[i]=1;
                }
                else
                {
                    arr[i]=0;
                }
            }
            if (arr[i] == arr1[i]) {
                count++;
            }
        }
        if(count==n)
        {
            System.out.println("YES");
        }
        else {
            System.out.println("NO");
        }
}
}
