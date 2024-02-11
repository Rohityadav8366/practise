package CodeChef;
import java.util.*;

public class ProLanguage {
        public static void main (String[] args) throws java.lang.Exception
        {
            // your code goes here
            Scanner sc=new Scanner(System.in);
            int t=sc.nextInt();
            while(t>0)
            {
                int[] arr=new int[6];
                for(int i=0;i<6;i++)
                {
                    arr[i]=sc.nextInt();
                }
                for(int i=2;i<arr.length-1;i++)
                {
                    int a=arr[0]+arr[1];
                    int b=arr[i]+arr[i+1];
                    if(a==b)
                    {
                        if((i == 4))
                        {
                            System.out.println("2");
                        }
                        else
                            System.out.println("1");
                    }
                    else
                        System.out.println("0");
                }
                t--;
            }

        }
    }


