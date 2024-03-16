package Multitheading;
// This is another methode to achives multithreading
//the Runnable interface is implements to attach to the thread so that is Class MY will be execute
//basically thread is execute directly so using the instance of the class
//and attach to the thread .
//Note -> thread is direct executed and runnable interface is executed by the help of <Thread>.
//class My implements Runnable
//{
//    public void run()
//    {
//        int i=1;
//        while(i<50)
//        {
//            System.out.println(i+" HELLO");
//            i++;
//        }
//    }
//}
public class RunnableInterface implements Runnable
{
    // without using class use methode
    public void run()
    {
        int i=0;
        while(i<50)
        {
            System.out.println(i+" HELLO");
            i++;
        }
    }

    public static void main(String[] args) {
       // My m=new My();
        RunnableInterface m=new RunnableInterface();
        Thread t=new Thread(m);
        t.start();
        int i=1;
        while(i<50)
        {
            System.out.println(i+" ROHIT");
            i++;
        }
    }
}
