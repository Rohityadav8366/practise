package LinkedList;

import java.util.Scanner;

public class main {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the size of LL");
        int n=sc.nextInt();
        LL linked =new LL();
        System.out.println("Enter the element:");
        for(int i=0;i<n;i++)
        {
            int num=sc.nextInt();
            //linked.insertFirst(num);
            linked.insertLast(num);
        }
//        System.out.println("Enter the val and index");
//        int val=sc.nextInt();
        int index=sc.nextInt();
//       // linked.insert(val,index);
       // linked.deleteLast();
        //linked.deleteFirst();
        linked.delete(index);
        linked.display();
    }
}
