package filehand;

import java.util.Scanner;

public class swape {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number A and B :");
        int a= sc.nextInt();
        int b= sc.nextInt();
        System.out.println("Swaped number:");
        a=a+b;
        b=a-b;
        a=a-b;
        System.out.println(a+"\n"+b);
    }
}
