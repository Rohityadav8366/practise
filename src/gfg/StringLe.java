package gfg;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class StringLe {

    public static void reverseString(){
        Scanner sc=new Scanner(System.in);
        String str=sc.nextLine();
        String[] str2=new String[3];
        StringBuffer str1=new StringBuffer();
        int temp=0;
        for(int i=0;i< str.length();i++){
            char ch=str.charAt(i);
            if(!(ch==' ')){
                str1.append(ch);
            }
            else{
                str2[temp]=String.valueOf(str1);
                str1.setLength(0);
                temp++;
            }
        }
        for(int i= str2.length-1;i>=0;i--){
            System.out.print(str2[i]+" ");
        }
    }

    public static void prime() {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int count = 0;
        if (n == 1) {
            System.out.println("Co-prime" + n);
        } else {
            for (int i = 2; i <= n / 2; i++) {
                if (n % i == 0) {
                    count++;
                }
            }
            if (count > 0) {
                System.out.println("Not prime" + n);
            } else {
                System.out.println("PRime " + n);
            }
        }
    }

    public static void reverse(){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int rev=0;
        while(n>0){
            int v=n%10;
            rev=(rev*10)+v;
            n=n/10;
        }
        System.out.println(rev);
    }

    public static void list(){
        Scanner sc=new Scanner(System.in);
        List<Integer> list=new ArrayList<>();
        System.out.println("Enter the size of list");
        int n=sc.nextInt();
        System.out.println("Enter the element of list ");
        for(int i=0;i<n;i++){
            list.add(sc.nextInt());
        }
        System.out.println(list.get(0));
        for(int x:list){
            System.out.println(list.get(0));
        }
    }

    public static void main(String[] args) {
        //reverseString();
       // prime();
       // reverse();
        list();
    }
}
