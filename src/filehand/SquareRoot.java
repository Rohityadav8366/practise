package filehand;

import java.util.Scanner;

public class SquareRoot {
    static void squareRoot(int n)
    {
        n=(int) Math.pow(n,0.5);
        System.out.println(n);
    }

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        squareRoot(n);
    }
}
