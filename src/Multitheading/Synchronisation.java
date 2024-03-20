package Multitheading;


class Mydata{
   synchronized public void display(String str)
    {
       // synchronized (this){
        for (int i=0;i<str.length();i++)
        {
            System.out.print(str.charAt(i));
            try{
                Thread.sleep(100);
            }catch (Exception e){}
        }
    }
}
// }
class MyThread1 extends Thread
{
    Mydata d;
    public  MyThread1(Mydata d)
    {
        this.d=d;
    }
    public void run()
    {
        d.display("Hello World ");
    }
}
class MyThread2 extends Thread
{
    Mydata d;
    public MyThread2(Mydata d)
    {
        this.d=d;
    }
    public void run()
    {
        d.display("Welcome All");
    }
}
public class Synchronisation {
    public static void main(String[] args) {
        Mydata m=new Mydata();
        MyThread1 t1=new MyThread1(m);
        MyThread2 t2=new MyThread2(m);
        t1.start();
        t2.start();
    }
}
