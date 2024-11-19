package array;

import java.util.Arrays;
import java.util.Scanner;

public class maxSum {
    public static void MaxSum(int[] arr){
        int sum=0;
        Arrays.sort(arr);
        for(int i=0;i<arr.length;i++){
            if(arr[i]<0){
                continue;
            } else if (i==0) {
                continue;
            } else{
                sum=sum+arr[i];
            }
        }
        System.out.println(sum);
    }

    public static void minJumps(int[] arr){

    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the size of array");
        int n=sc.nextInt();
        System.out.println("Enter the element of array ");
        int[] arr=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        MaxSum(arr);
    }
}
