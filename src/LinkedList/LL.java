package LinkedList;

public class LL {
    private Node head;
    private Node tail;
    private int size;
    public LL(){
        this.size=0;
    }
    public void insertFirst(int val)
    {
         Node node=new Node(val);
         node.next=head;
         head=node;
         if(tail==null)
         {
             tail=head;
         }
         size+=1;
    }
    public void insertLast(int val)
    {
        if(tail==null)
        {
            insertFirst(val);
            return;
        }
        Node node=new Node(val);
        tail.next=node;
        tail=node;
        size++;
    }
    public void insert(int val,int index)
    {
        if(index==0)
        {
            insertFirst(val);
            return;
        }
        if(index==size)
        {
            insertLast(val);
            return;
        }
        Node temp=head;
        for(int i=1;i<index;i++)
        {
            temp=temp.next;
        }
        Node node=new Node(val,temp.next);
        temp.next=node;
        size++;
    }
    //delete First index
    public int deleteFirst()
    {
        System.out.println("delete from first index:");
        int val=head.val;
        head=head.next;
        if(head==null){
            tail=null;
        }
        size--;
        return val;
    }
    public int deleteLast(){
        System.out.println("delete from last index");
        if (size<=1)
        {
            return deleteFirst();
        }
        Node secondLast=get(size-2);
        int val=tail.val;
        tail=secondLast;
        tail.next=null;
        return val;
    }
    public Node get(int index){
        Node node=head;
        for(int i=0;i<index;i++)
        {
            node=node.next;
        }
        return node;
    }
    public int delete(int index)
    {
        if(index==0){
            return deleteFirst();
        }
        if(index==size-1){
            return deleteLast();
        }
        Node prev=get(index-1);
        int val=prev.next.val;
        prev.next=prev.next.next;
        return val;
    }
    public void display()
    {
        Node temp=head;
        while(temp!=null){
            System.out.print(temp.val+" -> ");
            temp=temp.next;
        }
        System.out.println("END");
    }
    private  class Node{
        private int val;
        private Node next;
        public Node(int val)
        {
            this.val=val;
        }
        public Node(int val,Node next){
            this.val=val;
            this.next=next;
        }
    }

}
