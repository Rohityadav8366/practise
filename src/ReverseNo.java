import java.util.Scanner;

public class ReverseNo {
    static void reverse(int n)
    {
        while(!(n==0)){
            int a=n%10;
            System.out.print(a);
            n=n/10;
        }
    }

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number");
        int n=sc.nextInt();
        System.out.println("Reverse number:");
        reverse(n);
    }
}
