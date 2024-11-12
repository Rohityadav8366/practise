package gfg;

import java.util.Scanner;

public class StringLe {

    public static void reverseString(){
        Scanner sc=new Scanner(System.in);
        String str=sc.nextLine();
        String[] str2=new String[5];
        StringBuffer str1=new StringBuffer();
        for(int i=0;i< str.length();i++){
            char ch=str.charAt(i);
            if(!(ch==' ')){
                str1.append(ch);
            }
            else{
//                while(){
//                    str2[j]= String.valueOf(str1);
//                }
//                str1.
            }
        }
        for(String x:str2){
            System.out.println(x);
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
    public static void main(String[] args) {
       // reverseString();
        prime();
    }
}
