package JavaCollection;

import java.util.Collections;
import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

public class Linkedlist {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        LinkedList<Integer> l=new LinkedList<>();
        int t=sc.nextInt();
        while(t-->0) {
            int n = sc.nextInt();
       // List l1= Collections.singletonList(l.add(n));
            l.add(n);

        }
        System.out.println(l);
    }
}
