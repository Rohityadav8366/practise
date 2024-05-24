package CodeChef;

import java.util.Scanner;

public class MoodyChef {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the value of N,L,R");
        int n=sc.nextInt();
        int l=sc.nextInt();
        int r=sc.nextInt();
        System.out.println("Enter the value of Array :)");
        int[] arr=new int[n];
        for(int i=0;i<n;i++)
        {
            arr[i]=sc.nextInt();
        }
        int mincount=0;
        int maxcount=0;
        for(int i=0;i< arr.length;i++)
        {
            if(arr[i]>=l&&arr[i]<=r)
            {
                 maxcount+=1;
            }
            else
            {
                mincount-=1;
            }
        }
        System.out.println(maxcount+""+mincount);
    }
}
