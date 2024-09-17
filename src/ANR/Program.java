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
//Prime number
    public static void prime(int n){
        int count=1;

        for(int i=1;i<=n/2;i++)
        {
               if(n%i==0)
               {
                   count++;
               }
        }
        if(count==2)
        {
            System.out.println("prime");
        }
        else {
            System.out.println("Composite");
        }
    }

//Prime number between n and m
    public static void primeNo(int n,int m){

        while(n<=m) {
        int count=1;
         for (int i = 1; i <= n / 2; i++) {
        if (n % i == 0) {
            count++;
             }
         }
        if (count == 2) {
        System.out.print(n+"  ");
        }
        n++;
}
}
//fabonici series
    public static void fabonicci(int n)
    {
        int a=0,b=1;
        System.out.print(a+" ,"+b);
        while(n-->0)
        {
            int c=a+b;
            System.out.print(" ,"+c);
            a=b;
            b=c;
        }
    }
//pellondrom Number
    public static void pallindrom(int n){
        int s=n,pel = 0;
        while(n>0){
            int sum=n%10;
             pel=(pel*10)+sum;
            n=n/10;
        }
        System.out.println(pel);
        if(s==pel){
            System.out.println("Pellindrome");
        }
        else {
            System.out.println("Not Pellindrome");
        }
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the n");
        int n=sc.nextInt();
        //int m=sc.nextInt();
        fabonicci(n);
    }
}