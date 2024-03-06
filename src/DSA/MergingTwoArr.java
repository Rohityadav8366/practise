package DSA;

import java.util.Scanner;

public class MergingTwoArr {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the size of Arr1");
        int r=sc.nextInt();
        int[] arr1=new int[r];
        for(int i=0;i<r;i++)
        {
            arr1[i]=sc.nextInt();
        }
        System.out.println("Enter the size of Arr2");
        int p=sc.nextInt();
        int[] arr2=new int[p];
        for(int i=0;i<p;i++)
        {
            arr2[i]=sc.nextInt();
        }
        System.out.println("Enter the size of Arr3");
        int n=r+p;
        int[] arr3=new int[n];
        for(int i=0;i<r;i++)
        {
             arr3[i]=arr1[i];
        }for(int i=0;i<p;i++){
            arr3[i]=arr2[i];}
        for(int i=0;i<n;i++){
            System.out.println(arr3);}
    }
}
