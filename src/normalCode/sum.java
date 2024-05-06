package normalCode;

import string.LengthOfString;

import java.util.Scanner;

public class sum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number");
        long n = sc.nextLong();
        int sum = 0;
        int count =0;
            while (!(count==2)){
                long a = n % 10;
                sum += a;
                n = n / 10;
                if(n==0)
                {
                    n=sum;
                    sum=0;
                    count++;
                }
            }
        System.out.println(n);
 }
}
