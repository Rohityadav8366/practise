package CodeChef;

import java.util.Scanner;

public class DominenetElement {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the n:");
        int n=sc.nextInt();
        System.out.println("Enter the element of array:");
        int[] arr1=new int[n];
        int [] arr=new int[n];
        int count=0;
        for(int i=0;i<n;i++)
        {
            arr[i]=sc.nextInt();
        }
        for(int i=0;i<arr.length;i++) {
            for(int j=i+1;j<arr.length;j++)
            {
                if(arr[i]==arr[j])
                {
                    count++;
                }
            }
            if(count>0){
             arr1[i]=count;}
            count=0;
        }
        for(int i=0;i<arr1.length-1;i++){
            if(arr1[i]>arr1[i+1])
            {
                System.out.println("yes");
            }
            else {
                System.out.println("NO");
            }
        }
    }
}
