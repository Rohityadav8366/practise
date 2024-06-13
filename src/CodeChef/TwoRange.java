package CodeChef;

import java.util.Scanner;

public class TwoRange {
    public static void main(String[] args) {
  Scanner sc=new Scanner(System.in);

  int a=sc.nextInt();
                    int b=sc.nextInt();
                    int c=sc.nextInt();
                    int d=sc.nextInt();
                    int max=Math.max(Math.max(a, b), Math.max(c, d));
                    int min=Math.min(Math.min(a, b), Math.min(c, d));
                    int count=0;
                    for(int i=min; i<=max; i++){
                        if(a<=b){
                            count++;
                            a++;
                        }
                        else if(c<=d){
                            count++;
                            c++;
                        }
                    }
                    System.out.println(count);


    }
}
