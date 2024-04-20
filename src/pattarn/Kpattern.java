package pattarn;

import java.util.Scanner;

public class Kpattern {
    public static void main(String[] args) {
        Scanner sc=new Scanner (System.in);

        for(int i=1;i<=5;i++)
        {
            for(int j=1;j<=5;j++)
            {
                if(j==1||i==3&&j==2||(i==2||i==4)&&j==4||(i==1||i==5)&&j==5)
                {
                    System.out.print("*");
                }
                else{
                System.out.print(" ");
                //just for git commit
                    //mcdkmcm
                    }
            }
            System.out.println();
        }
    }
}
