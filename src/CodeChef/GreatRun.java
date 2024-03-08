package CodeChef;

import java.util.Scanner;

public class GreatRun {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int k=sc.nextInt();
        int max=0,sum=0;
        int[] arr=new int[n];
        for(int i=0;i<n;i++)
        {
            arr[i]=sc.nextInt();
        }
        for(int i=0;i<arr.length-k;i++)
        {
            for(int j=0;j<k;j++)
            {
                sum+=arr[i];
                i++;
            }
            if(sum>max)
            {
                max=sum;
            }
            i=i-k;
            sum=0;
        }
        System.out.println(max);
    }
}
