package LinkedList;

import java.util.Scanner;

class Node {
    int data;
    Node next;

    public Node(int data) {
        this.data = data;
        this.next = null;
    }
}
public class LinkedList {
    public static void traverseLL(Node head)
    {
        Node current=head;
        while(current!=null)
        {
            System.out.print(current.data+" ");
            current=current.next;
        }
    }

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the size of linked list:");
        int n=sc.nextInt();
        Node head=null;
        Node tail=null;
        System.out.println("Enter the element:");
        for(int i=0;i<n;i++)
        {
            int data=sc.nextInt();
            Node newNode=new Node(data);
            if(head==null){
                head=newNode;
                tail=newNode;
            }
            else {
                tail.next=newNode;
                tail=newNode;
            }
        }
        traverseLL(head);
    }
}
