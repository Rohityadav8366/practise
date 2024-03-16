package Multitheading;

// By using two class in this programing

//class MyThread extends Thread{
     // run() is the methode which is declear the thread .
//    public void run()
//    {
//        int i=1;
//        while(i<5)
//        {
//            System.out.println(i+" HELLO");
//            i++;
//        }
//    }
//}
//public class ThreadClass {
//    public static void main(String[] args) {
        // Here we made thread instance
//        MyThread mt=new MyThread();
        //instance and .start() methods is call the run() method thread
//        mt.start();
//        int i=1;
//        while(i<5)
//        {
//            System.out.println(i+" ROHIT");
//            i++;
//        }
//    }
//}


// here thread programe which  ues single class

public class ThreadClass extends Thread
{
    public void run()
    {
        int i=1;
        while(i<5)
        {
            System.out.println(i+" HELLO");
            i++;
        }
    }
    public static void main(String[] args)
    {
        ThreadClass mp=new ThreadClass();

        mp.start();
        int i=1;
        while(i<5)
        {
            System.out.println(i+" ROHIT");
            i++;
        }
    }
}