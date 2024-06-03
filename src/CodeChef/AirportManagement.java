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
            for(int i=0;i<n;i++)
            {
                for(int j=0;j<n;j++) {
                    if (arrA[i] >= arrA[j] && arrD[i] >= arrD[j] && arrD[i] >= arrA[j]) {
                        count++;
                    } else if (arrA[i] >= arrA[j] && arrD[i] >= arrD[j] || arrD[i] >= arrA[j]) {
                        count++;
                    }
                }
            }
        System.out.println(count);
    }
}
