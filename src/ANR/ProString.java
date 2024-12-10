package ANR;

import Stream.ReadIntoFile;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.*;

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
                int value=0;
                System.out.println();

            }
        System.out.println(hs);
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


    public static void topalindrome() {
        Scanner sc=new Scanner(System.in);
        String str=sc.nextLine();
        int a=str.length()/2;
        int pair=0,count=0,roh=0;
        for(int i=0;i<str.length();i++) {

            for(int j=i;j<str.length();j++) {
                char chh=str.charAt(j);
                char ch = 0;
                if(ch==chh) {
                    count++;
                    if(count%2==0) {
                        pair++;
                    }
                    else if(count%2==1&&count>=3){
                        roh++;
                    }
                }
            }
            count=0;
        }
        if(pair==a&&roh<2) {
            System.out.println("It is possible to make palindrome");
        }else {
            System.out.println("it is not possible to make palindrome");
        }

    }
    public static void lar(){
            int a=100;
            int b=23;
            int c=400;
            if(a>b){
                if(a>c){
                    System.out.println("A >c,b");
                }
            } else if (b>c) {
                System.out.println("b >a,c");
            }
            else{
                System.out.println("c >a,b");
            }
    }
    public static void removeDublicacy(){
        int [] arr={1,2,2,3,3,3};
        List list=new ArrayList();
        for(int i=0;i< arr.length;i++){
            if(arr[i]!=arr[i+1]){
                list.add(arr[i]);
            }
        }
        System.out.println(list);
    }

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
      //  String str=sc.nextLine()
        removeDublicacy();
    }
}
