package ANR;

import java.util.Scanner;

public class learning1 {
    public static int accending(int[] arr){
       int count=0;
        for (int i = 0; i < arr.length - 1; i++)
            for (int j = 0; j < arr.length - i - 1; j++)
                if (arr[j] > arr[j + 1]) {
                    // swap temp and arr[i]
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                    count++;
                }

        return count;
    }
    public static int decending(int[] arr){
        int count1=0;
        for (int i = 0; i <arr.length - 1; i++)
            for (int j = 0; j < arr.length - i - 1; j++)
                if (arr[j] < arr[j + 1]) {
                    // swap temp and arr[i]
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                    count1++;
                }
        return count1;
    }

    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        System.out.println("Enter the value of n:");
        int n=sc.nextInt();
        int[] arr=new int[n];
        for(int i=0;i<n;i++)
        {
            arr[i]=sc.nextInt();
        }
        if(accending(arr)>=decending(arr)){

            System.out.println("Deccnding ");
        }
        else {
            System.out.println("Accending ");
        }
    }
}
