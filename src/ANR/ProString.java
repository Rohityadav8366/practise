package ANR;

import Stream.ReadIntoFile;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.HashMap;
import java.util.Scanner;

public class ProString {

//char from string
        public static void reverseString(String str) {
            char[] chArr= str.toCharArray();
            StringBuffer sb=new StringBuffer(str);
            StringBuilder stringBuilder=new StringBuilder(str);
            for (int i = str.length() - 1; i >= 0; i--) {
//                System.out.print(chArr[i]);
//                System.out.print(str.charAt(i));
            }
            System.out.println(sb.reverse());

            System.out.println(stringBuilder.reverse());

        }
//Pallindrom string
    public static void pallindrome(String str)
    {
       StringBuilder sb=new StringBuilder(str);
       String rev= String.valueOf(sb.reverse());
        if(rev.equals(str)){
            System.out.println("Pallindrom");
        }
        else {
            System.out.println("Not Pallindrome");
        }
    }
//NO.Of unique word in HashMap
    public static void noOfUnique(int k,String str){
        HashMap hs=new HashMap();

    }

    public static void file(){
            String filePath="filedatabase.txt";

        try(BufferedReader br=new BufferedReader(new FileReader(filePath))){
            String line;
            while((line=br.readLine())!=null){
                System.out.println(line);
            }
        }catch(IOException e){
            System.out.println("An error occured");
        }
    }

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String str=sc.nextLine();
       file();
    }
}
