package hackerRank;

import java.util.Scanner;

public class StarPattern {
    public static void main(String[] args) {
       Scanner sc=new Scanner(System.in);
//        for(int i=1;i<=7;i++)
//        {
//            for(int j=1;j<=10;j++)
//            {
//                if(i==3||i-j==2||i+j==13||i==6)//jgftf
//                {
//                    System.out.print("*");
//                }
//                else {
//                    System.out.print(" ");
//                }
//            }
//            System.out.println();
//        }





        int n=sc.nextInt();
        int m=sc.nextInt();
        int area=n*m;
        int max=0,min=100;
        for(int i=2;i<=n;i++)//vvjh
        {
            if(area%(i*i)==0)
            {
                max=area/(i*i);
                if(min>max)
                {
                    min=max;

                }

            }
        }
        System.out.println(min);

    }
}
