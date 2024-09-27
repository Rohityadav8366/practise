package ANR;

import Stream.ReadIntoFile;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class ProString {

//char from string
        public static void reverseString(String str) {
            char[] chArr= str.toCharArray();
            StringBuffer sb=new StringBuffer(str);
            StringBuilder stringBuilder=new StringBuilder(str);
            for (int i = str.length() - 1; i >= 0; i--) {
                System.out.print(chArr[i]);
                System.out.print(str.charAt(i));
            }
            System.out.println(sb.reverse());

            System.out.println(stringBuilder.reverse());

        }
//Palindrome string
    public static void palindrome(String str)
    {
       StringBuilder sb=new StringBuilder(str);
       String rev= String.valueOf(sb.reverse());
        if(rev.equals(str)){
            System.out.println("Palindrome");
        }
        else {
            System.out.println("Not Palindrome");
        }
    }
//NO.Of unique word in HashMap
    public static void noOfUnique(){
            Scanner sc=new Scanner(System.in);
            String str=sc.nextLine();
            Map<String,Integer> hs=new HashMap<>();
            for(int i=0;i<str.length();i++){
                char ch=str.charAt(i);
                hs.keySet().add(String.valueOf(ch));
            }
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

    public static void toCheckPalindrome(){
            Scanner sc=new Scanner(System.in);
            String str=sc.nextLine();
            StringBuffer str1=new StringBuffer();
            for(int i=str.length()-1;i>=0;i--){
                char ch=str.charAt(i);
                str1.append(ch);
            }
            String s= String.valueOf(str1);
            if(str.equals(s)){
                System.out.println("palindrome");
            }else{
                System.out.println("not palindrome");
            }

    }


    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
      //  String str=sc.nextLine();
       toCheckPalindrome();
    }
}
