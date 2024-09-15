package ANR;

import java.util.Scanner;
public static int sunOfN(int n)
{
    int sum=0;
    for(int i=1;i<=n;i++)
    {
        sum+=n;
    }
    return sum;
}
public class Program {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the n");
        int n=sc.nextInt();
;       sunOfN(n);
    }
}
