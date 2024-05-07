package LinkedList;

import java.util.Scanner;

public class main {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        LL linked =new LL();
        for(int i=0;i<n;i++)
        {
            int num=sc.nextInt();
            //linked.insertFirst(num);
            linked.insertLast(num);
        }
        linked.display();
    }
}
