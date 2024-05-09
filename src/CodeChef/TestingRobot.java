package CodeChef;

import java.util.Scanner;

public class TestingRobot {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the value of N and X:");
        int n=sc.nextInt();
        int x=sc.nextInt();
        sc.nextLine();
        String str=sc.nextLine();
        int[] arr=new int[n+1];
        int count=0;
        for(int i=0;i<n;i++)
        {
            arr[i]=x;
            if(str.charAt(i)=='R')
            {
                x+=1;
                arr[i+1]=x;
            }
            if(str.charAt(i)=='L')
            {
                x-=1;
                arr[i+1]=x;
            }
        }
        for(int i=0;i<n+1;i++) {
            for (int j = i+1; j < n + 1; j++) {
                if (arr[i] == arr[j]) {
                    count++;
                }
            }
        }
        System.out.println((n+1)-count);
    }
}
