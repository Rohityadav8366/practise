package pattarn;
import java.util.Scanner;
public class RigTriFectorial {
    public static void rigTriFecto(int n)
    {
        int sum=1;
     for(int i=1;i<=n;i++)
     {
         for(int j=1;j<=i;j++)
         {
             int k=j;
             while(k>0) {
                 sum *= k;
                 k--;
             }
             System.out.print(sum+"  ");
         }
         System.out.println();
     }
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the no. you want to print");
        int n=sc.nextInt();
        rigTriFecto(n);
    }
}
