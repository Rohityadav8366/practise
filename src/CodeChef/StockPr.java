package CodeChef;
import java.util.Scanner;
public class StockPr {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while(t-->0)
        {
            int s=sc.nextInt();
            int a=sc.nextInt();
            int b=sc.nextInt();
            float c=sc.nextInt();
            float y=s*(c/100);
            float x=s+y;
            if(x>=a&&x<=b)
            {
                System.out.println("YES");
            }
            else
            {
                System.out.println("NO");
            }
        }
    }
}
