package CodeChef;
import java.util.Scanner;

public class Motivation {
    public static void main (String[] args)
        {
            // your code goes here
            Scanner sc=new Scanner(System.in);
            int t=sc.nextInt();
            while(t>0)
            {

                int max=0;
                int n=sc.nextInt();
                int x=sc.nextInt();
                for(int i=1;i<n+1;i++)
                {
                    int s=sc.nextInt();
                    int r=sc.nextInt();
                    if(x>=s&&max<r){
                        max=r;

                    }

                }
                System.out.println("max "+max);
                t--;
            }
        }
    }

