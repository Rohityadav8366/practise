package string;

import java.util.Scanner;

public class StringPrac {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String[] str=new String[5];
        for(int i=0;i<3;i++){
            str[i]=sc.next();
            System.out.println(str[i]);
        }

    }
}
