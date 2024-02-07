package CodeChef;
import java.util.Scanner;
public class Prime {
    public static void main (String[] args) throws java.lang.Exception
    {
        // your code goes here
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while(t>0)
        {
            int count=0;
            int n=sc.nextInt();
            for(int i=2;i<n/2;i++){
                if(n%i==0){
                    count++;
                }
            }
            if(count>0)
                System.out.println("no");
            else if(n==0||n==1)
                System.out.println("no");
            else
                System.out.println("yes");
            t--;
        }

    }
}
