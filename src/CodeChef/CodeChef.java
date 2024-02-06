package CodeChef;
import java.util.*;
import java.lang.*;
import java.io.*;
public class CodeChef {

        public static void main (String[] args) throws java.lang.Exception
        {
            // your code goes here
            Scanner sc=new Scanner(System.in);
            int t=sc.nextInt();
            int[] arr= new int[2];
            while(t>0)
            {

                for(int i=0;i<2;i++)
                {
                    arr[i]=sc.nextInt();
                }
                t--;
            }
            for(int i=0;i<arr.length;i++)
            {
                if(arr[0]>arr[1])
                {
                    System.out.println("1 "+(arr[0]-arr[1]));
                }
                else
                {
                    System.out.println("2 "+(arr[1]-arr[0]));
                }
            }
        }
    }

