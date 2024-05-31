package CodeChef;

import java.util.Scanner;

public class Temperature {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
                int a=sc.nextInt();
                int b=sc.nextInt();

                int x=sc.nextInt();
                int y=sc.nextInt();
                if(a>=b)
                {
                    int c=a-b;
                    if(c<=y)
                    {
                        System.out.println("Yes");
                    }
                    else{
                        System.out.println("No");
                    }
                }
                else{
                    int c=b-a;
                    if(c<=x)
                    {
                        System.out.println("Yes");
                    }
                    else{
                        System.out.println("No");
                    }
                }


            }
        }

