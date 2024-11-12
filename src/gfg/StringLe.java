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

    public static void prime(){
        Scanner sc=new Scanner(System.in);
        int n =sc.nextInt();

    }

    public static void main(String[] args) {
        reverseString();
    }
}
