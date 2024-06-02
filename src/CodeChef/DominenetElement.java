package CodeChef;

import java.util.Scanner;

public class DominenetElement {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the n:");
        int n=sc.nextInt();
        System.out.println("Enter the element of array:");
        int [] arr=new int[n];
        int count=0,max=0,din=0;
        for(int i=0;i<n;i++)
        {
            arr[i]=sc.nextInt();
        }
        for(int i=0;i<arr.length;i++) {
            for(int j=i+1;j<arr.length;j++)
            {
                if(arr[i]==arr[j])
                {
                    count++;
                }
            }
            if(max<count){
             max=count;} else if (max==count) {
                din=count;
            }
            count=0;
        }
        if(max>din)
        {
            System.out.println("YES");
        }
        else {
            System.out.println("NO");
        }
    }
}
