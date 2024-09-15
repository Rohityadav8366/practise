package ANR;

import java.util.Scanner;

public class ProString {

//char from string
        public static void stringToChar(String str){
            for(char ch=0;ch<str.indexOf(ch);ch++){
                System.out.println(ch);
            }
        }


    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String str=sc.nextLine();
        stringToChar(str);
    }
}
