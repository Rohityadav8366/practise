package Multitheading;

class MyThread extends Thread
{
//    public MyThread()
//    {
//        super(name);
//    }
    public void run()
    {
        int count=1;
        while(true){
            System.out.println(count++ +" HELLO");
//            try
//            {
//               Thread.sleep(100);
//            }
//            catch (InterruptedException e){
//                System.out.println(e);
//            }
        }
    }
}
public class ThreadMethode
{
    public static void main(String[] args) throws Exception
    {
        MyThread t=new MyThread();
//        System.out.println(t.getId());
//        System.out.println(t.getName());
//        System.out.println(t.getPriority());
//        t.start();
//        System.out.println(t.getState());
//        System.out.println(t.isAlive());
//        System.out.println(t.isDaemon());
            t.setDaemon(true);
            t.start();
          // try{Thread.sleep(10);}catch(Exception e){}
        Thread mainThread=Thread.currentThread();
        //join() methode is the wait other thread to terminate
      // mainThread.join();
        int count=1;
        while(true) {
            System.out.println(count++ + " rohit");

            // yield() methode is the methode which is provided other thread more CPU time

            Thread.yield();
        }
    }
}
