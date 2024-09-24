package ANR;

import string.LengthOfString;

import java.util.*;

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
//Armstrong number
    public static void armstrong(int n)
    {

       int m=0,s=n;
       while(n>0){
           n=n/10;
           m++;
       }
       int sum=0;
       n=s;
       while(s>0){
           int v=s%10;
            sum= (int) (sum+Math.pow(v,m));
            s=s/10;
       }
        System.out.println(sum);
       if(n==sum){
           System.out.println("Arsmtrong no.");
       }
       else {
           System.out.println("Not Armstrong no.");
       }
    }
//To make pallendrome number by given number
    public static void toPellindrome(int n)
    {
        //List list=new ArrayList<>();
        int m=0,s=n;
        while(n>0){
            n=n/10;
            m++;
        }
        int [] arr=new int[m];
        n=s;
            for(int i=0;i<m;i++){
                int v=n%10;
                arr[i]=v;
                n=n/10;
            }
        for(int i:arr){
            System.out.print(i+" ");
        }

    }
//Interview Question
    public static int majorityElement(final int[] A) {
    int n=A.length;
    int a=0,count=0,b=0;
    for(int i=0;i<A.length-1;i++)
    {
        for(int j=i+1;j<A.length;j++)
        {
            if(A[i]==A[j]){
                count++;
            }
        }
        if(a<count)
        {
            a=count;
            b=A[i];
        }
        count=0;
    }
    if(a>=n/2){
         return b;
    }
    return b;
}
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the n");
        int n=sc.nextInt();
        //int m=sc.nextInt();
        int[] A=new int[n];
        for(int i=0;i<n;i++)
        {
            A[i]=sc.nextInt();
        }
        System.out.println(majorityElement(A));
    }
}
