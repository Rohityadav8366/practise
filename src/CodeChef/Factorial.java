package CodeChef;
import java.util.*;
import java.lang.*;

public class Factorial {

        static void fac(int n)
        {
            int sum=1;
            for(int i=n;i>0;i--)
            {
                sum*=i;
            }
            System.out.println(sum);
        }
        public static void main (String[] args) throws java.lang.Exception
        {
            // your code goes here
            int n=0;
            Scanner sc=new Scanner(System.in);
            int t=sc.nextInt();
            while(t>0)
            {
                n=sc.nextInt();
               // fac(n);
                t--;
            }
            fac(n);

        }
    }


