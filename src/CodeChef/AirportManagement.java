package CodeChef;

import java.util.Scanner;

public class AirportManagement {
    static int noOfRunway(int n,int[] arrA,int[] arrD)
    {
        int count=0;
        for(int i=0;i<n-1;i++)
        {
         if(arrA[i]==arrA[i+1]&&arrD[i]==arrD[i+1]||arrD[i]==arrA[i+1])
         {
             count++;
         }
            if(arrA[i]>=arrA[i+1]&&arrD[i]>=arrD[i+1]||arrD[i]>=arrA[i+1])
            {
                count++;
            }
        }
        return count;
    }
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
        System.out.println(noOfRunway(n,arrA,arrD));
    }
}
