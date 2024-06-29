package array;

import java.util.Scanner;

public class AddMatrix {


    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the size of matrix:");
        int m=sc.nextInt();
        int n=sc.nextInt();
        System.out.println("Enter the element of first matrix:");
        int [][] arr=new int[m][n];


        for(int i=0;i<m;i++)
        {
            for(int j=0;j<n;j++)
            {
                arr[i][j]=sc.nextInt();
            }
        }
        System.out.println("Enter the element of second matrix:");
        int[][] arr1=new int[m][n];
        for(int i=0;i<m;i++)
        {
            for(int j=0;j<n;j++)
            {
                arr1[i][j]=sc.nextInt();
            }
        }
        System.out.println("first matrix:");
        for(int i=0;i<m;i++)
        {
            for(int j=0;j<n;j++)
            {
                System.out.print(arr[i][j]+" ");
            }
            System.out.println();
        }
        System.out.println("second matrix:");
        for(int i=0;i<m;i++)
        {
            for(int j=0;j<n;j++)
            {
                System.out.print(arr1[i][j]+" ");
            }
        }
        System.out.println("Add of two Matrix:");
        for(int i=0;i<m;i++)
        {
            for (int j=0;j<n;j++)
            {
               int arr3 =arr[i][j]+arr1[i][j];
                System.out.print(arr3+" ");
            }
            System.out.println();
        }
    }
}
