package CodeChef;

import java.util.Scanner;

public class sort {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int count=0;
        int[] a=new int [n];
        int[] a1=new int [n];
        for(int i=0; i<n; i++){
            a[i]=sc.nextInt();

        }
        for(int i=0; i<a.length; i++){

            for(int j=i+1; j<a.length; j++){
                if(a[i]>a[j]){
                    a1[i]=a[j];
                }

            }//hyr6ur
        }
        for(int i=0;i<a.length;i++)
        {
            System.out.print(a1[i]+" ");
        }
    }
}
