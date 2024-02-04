import java.util.Scanner;

public class PalindromeNo {
    static void palindrome(int n)
    {
        int mat=0;
        int b=n;
        while(!(n==0))
        {
            int a=n%10;
            mat=(mat*10)+a;
            n=n/10;
        }
        if(b==mat){
            System.out.println("reverse number:"+mat);
            System.out.println("Palindrome Number: "+b);
        }
        else {
            System.out.println("Not Palindrome number: "+b);
        }
    }

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number");
        int n=sc.nextInt();
        palindrome(n);
    }
}
