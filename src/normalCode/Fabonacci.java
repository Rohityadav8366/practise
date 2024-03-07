package normalCode;

import java.util.Scanner;

public class Fabonacci {
    static int fabonacci(int n){
        int a=1,b=0;
        System.out.print(b+" ");
        System.out.print(a+" ");
        int sum=0;
        for (int i=1;i<=n-2;i++){
            sum=a+b;
            System.out.print(sum+" ");
            b=a;
            a=sum;

        }
        return 0;
    }
    //using recurtion


    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number ");
        int n=sc.nextInt();
        fabonacci(n);
    }
}
