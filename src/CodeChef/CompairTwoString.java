package CodeChef;
import java.util.*;
public class CompairTwoString {
    public static void main(String[] args) throws Exception
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the n");
        int n=sc.nextInt();
        sc.nextLine();
        String s=sc.nextLine();
        String r=sc.nextLine();
        int countS=0,countR=0;
        for(int i=0;i<n;i++)
        {
            if(s.charAt(i)=='1')
            {
                countS++;
            }
            if(r.charAt(i)=='1')
            {
                countR++;
            }
        }
        if(countS==countR)
        {
            System.out.println("yes");
        }
        else {
            System.out.println("no");
        }


//        int a=34,b=50,c=56;
//        int i = (a > b) ? ((a > c) ? a : c) : (b > c) ? b : c;
//        System.out.println(i);

    }
}
