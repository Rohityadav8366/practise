package normalCode;

import java.util.Scanner;

public class Factoral {
    static void factorial(int n)
    {
        int sum=1;
        while(!(n==0)){
            sum=sum*n;
            n=n-1;
        }
        System.out.println("Factorial :"+sum);
    }

    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number");
        int n=sc.nextInt();
        factorial(n);
    }
}
