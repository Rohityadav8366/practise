package ANR;

import java.util.Scanner;

public class Program {
//sum of n no.
    public static int sumOfN(int n)
    {
        int sum=0,i=1;
       while(i<=n)
        {
            sum+=i;
            i++;
        }
        return sum;
    }
//odd no. into range
    public static void oddNORange(int n, int m){
        while (n <= m) {
                if(n%2==1) {
                System.out.print(n+" ,");
            }
                n++;
        }
    }
//evev no into range
    public static void evenNORange(int n, int m){
        while (n <= m) {
            if(n%2==0) {
                System.out.print(n+" ,");
            }
            n++;
        }
    }
//sum of odd no
    public static void sumOddNORange(int n, int m){
        int sum=0;
        while (n <= m) {
            if(n%2==1) {
                sum=sum+n;
            }
            n++;
        }
        System.out.println(sum);
    }
//sum of even no
    public static void sumEvenNORange(int n, int m){
        int sum=0;
        while (n <= m) {
            if(n%2==0) {
                sum=sum+n;
            }
            n++;
        }
        System.out.println(sum);
    }
    public static void factorial(int n){
        int facto=1;
        for(int i=n;i>=1;i--)
        {
            facto=facto*i;
        }
        System.out.println(facto);
    }
    public static void prime(int n){
        int count=0;

        for(int i=1;i<n/2;i++)
        {
           if(i%2==1){
               if(n%i==0)
               {
                   count++;
               }
           }
        }
        if(n==2){
            System.out.println("prime");
        }
        else if(count<0)
        {
            System.out.println("prime");
        }
        else {
            System.out.println("Composite");
        }
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the n");
        int n=sc.nextInt();
        //int m=sc.nextInt();
        prime(n);
    }
}
