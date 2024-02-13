package CodeChef;
import java.util.Scanner;
public class max {
    public static void main(String[] args) {

            // your code goes here
        // your code goes here
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while(t>0)
        {
            int n=sc.nextInt();
            int k=sc.nextInt();
            //  int m=0;
            for(int i=k;i>n;i--)
            {
                if(n>=k)
                {
                    n=n-k;
                }
                else
                    System.out.println(n);
            }
            System.out.println(n);
            t--;
        }
        }
    }

