//package Multitheading;
//
// class Atm1 {
//    public void cheackBalance(String name) {
//        System.out.print(name + "Cheacking ");
//        try {
//            Thread.sleep(100);
//        } catch (Exception e) {
//        }
//        System.out.println("Balance");
//    }
//
//    public void withdral(String name, int amount) {
//        System.out.println(name + " Withdrawing ");
//        try {
//            Thread.sleep(100);
//        } catch (Exception e) {
//        }
//        System.out.println(amount);
//    }
//
//}
//
//class Customer extends Thread {
//    String name;
//    int amount;
//    Atm atm;
//    Customer(String,n,Atm,a,int amt)
//    {
//        name=n;
//        atm=a;
//        amount=amt;
//    }
//    public void useATM()
//    {
//        atm1.cheackBalance(name);
//        atm1.withdral(name,amount);
//    }
//    public void run()
//    {
//        useATM();
//    }
//}
//public class Atm
//{
//    public static void main(String[] args) {
//        Atm atm=new Atm();
//        Customer c1=new Customer("rohit",atm,100);
//        Customer c2=new Customer("YAdav",atm,200);
//        c1.start();
//        c2.start();
//    }
//}
