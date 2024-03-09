package string;

import java.util.Scanner;

public class StringPrac {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String[] str=new String[1];
        for(int i=0;i< str.length;i++){
            str[i]=sc.next();
            System.out.println(i+1+"-"+str[i]);
        }

    }
}
