import java.util.Scanner;

public class VowelChar {
    static void vowelChar(char ch) throws Exception
    {
        char[] arr={'a','A','e','E','i','I','o','O','u','U'};
        boolean al=false;
        for(int i=0;i<= arr.length;i++)
        {
         if(arr[i]==ch){
            al=true;
            break;
         }
        }
            if (al) {
                System.out.println("Vowel charector");
            } else {
                System.out.println("Consonent charector");
            }
    }

    public static void main(String[] args) throws Exception
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the charactor");
        char ch=sc.next().charAt(0);
        vowelChar(ch);
    }
}
