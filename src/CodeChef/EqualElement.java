package CodeChef;
import java.util.*;
public class EqualElement {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int sum=0;
        float aver=0;
        System.out.println("Enter the size of array");
        int n=sc.nextInt();
        System.out.println("Enter the element of Array ");
        int[] arr=new int[n];
        for(int i=0;i<n;i++)
        {
            arr[i]=sc.nextInt();
            sum+=arr[i];
        }
        int avr=sum/n;
        aver=(float)sum/n;
        if(aver>avr)
        {
            int aver1=(int)aver+1;
            System.out.println(aver1);
        }
        System.out.println("Every thing is done");
        System.out.println(sum+"  "+aver);
     }
}
