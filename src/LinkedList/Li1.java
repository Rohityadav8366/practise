package LinkedList;

import java.util.Scanner;

public class Li1 {
    Node head;
   static class Node{
        int data;
        Node next;
        Node (int d) {
            data = d;
            next = null;
        }
    }
    public static Li1 insert(Li1 list,int data){
       Node newNode=new Node(data);
       if(list.head==null){
           list.head=newNode;
       }
       else{
           Node last=list.head;
           while(last.next!=null){
               last=last.next;
           }
           last.next=newNode;
       }
       return list;
    }

    public static void printList(Li1 list){
       Node currNode=list.head;
        System.out.println("LinkedList :");
        while(currNode!=null){
            System.out.println(currNode.data+" ");
            currNode=currNode.next;
        }
    }
    public static void main(String[] args) {
       Scanner sc=new Scanner(System.in);
        Li1 list=new Li1();
        System.out.println("Enter the size of LinkedList ");
        int n=sc.nextInt();
        for(int i=1;i<=n;i++){
            list=insert(list,sc.nextInt());
        }
        printList(list);
    }
}
