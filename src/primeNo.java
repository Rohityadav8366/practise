import java.util.Scanner;

public class primeNo {
      static void prime(int n){
          int i=1,count=0;
          if(n>1) {
              //prime no logic started
              while (i <= n) {
                  if (n % i == 0) {
                      count++;
                  }
                  i++;
              }
              if(count==2){
                  System.out.println("Prime Number: "+n);
              }
              else {
                 // System.out.println("Composite number: "+n);
              }
              //till
              n--;
              prime(n);

          }

    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number:");
        int n= sc.nextInt();
        prime(n);
    }
}
