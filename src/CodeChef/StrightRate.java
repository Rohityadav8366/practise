package CodeChef;

import java.util.Scanner;

public class StrightRate {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        double run=0,ball=0,count=0;
        int[] arr=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
            run+=arr[i];
            ball++;
            double d=run/ball;
            if(d==1)
            {
                count++;
            }
        }
        System.out.println(count);//bggug
    }
}
