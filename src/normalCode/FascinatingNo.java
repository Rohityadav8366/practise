package normalCode;

import java.util.Scanner;

public class FascinatingNo {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int count=0;
        System.out.println("Enter the Fascinating number");
        int n=sc.nextInt();
        int length=String.valueOf(n).length();
        if(length>=3)
        {
            int a=n*2;
            int b=n*3;
          String oncat=n+""+a+b;
          System.out.println(oncat);
        for(int i=0;i<oncat.length();i++)
        {
            for(int j=i+1;j<oncat.length();j++) {
                if (oncat.charAt(i) == oncat.charAt(j)) {
                    count++;
                }
            }
        }
        if(count>0)
        {
            System.out.println("Duplicate number are : "+count);
            System.out.println("NO it is not fascinating number: "+n);
        }
        else
        {
            System.out.println("YES it is fascinating number: "+n);
        }
        }
        else
        {
            System.out.println("Given number is less then 3 so, it is not fascinating number: "+n);
        }
    }
}
