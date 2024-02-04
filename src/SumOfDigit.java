import java.util.Scanner;

public class SumOfDigit {
    static void sumofdigit(int n){
        int sum=0;
        while(!(n==0)){
            int a=n%10;
            sum=sum+a;
            n=n/10;
        }
        System.out.println("Sume of Digit is: "+sum);
    }

    public static void main(String[] args) throws Exception {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number:");
        int n=sc.nextInt();
        sumofdigit(n);
    }
}
