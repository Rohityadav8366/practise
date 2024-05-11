package CodeChef;

import java.util.Scanner;

public class AirportManagement {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("ENter the no. of Airplanes:");
        int n=sc.nextInt();
        int count=1;
        System.out.println("Enter the Arrival time:");
        int[] arrA=new int[n];
        for(int i=0;i<n;i++)
        {
            arrA[i]=sc.nextInt();
        }
        System.out.println("Enter the Departure Time:");
        int[] arrD=new int[n];
        for(int i=0;i<n;i++)
        {
            arrD[i]=sc.nextInt();
        }
            for(int i=0;i<n-1;i++)
            {
                if(arrA[i]>=arrA[i+1]&&arrD[i]>=arrD[i+1]&&arrD[i]>=arrA[i+1])
                {
                    count++;
                }
                else if(arrA[i]>=arrA[i+1]&&arrD[i]>=arrD[i+1]||arrD[i]>=arrA[i+1])
                {
                    count++;
                }
            }
        System.out.println(count);
    }
}
