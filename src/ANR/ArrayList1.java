package ANR;

import java.util.*;

public class ArrayList1 {
    public static void main(String[] args) {
        List<Integer> a1= new ArrayList<>();
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the n");
        int n=sc.nextInt();
        System.out.println("Enter "+n+" number");
        for(int i=0;i<n;i++)
        {
            int num=sc.nextInt();
            a1.add(num);

        }
            for(int a:a1)
            {
                System.out.print(a+" ");
            }
    }
}
