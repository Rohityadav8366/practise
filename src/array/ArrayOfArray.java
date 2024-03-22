package array;
class Customer{
    int id;
    String name;
    String requirment;
    int cost;
}
public class ArrayOfArray
{
    public static void main(String[] args) {
        Customer c1=new Customer();
        Customer c2=new Customer();
        Customer c3=new Customer();
        Customer c4=new Customer();
        c1.id=1;
        c1.name="rohit";
        c1.requirment="sugar";
        c1.cost=50;

        c2.id=2;
        c2.name="rupesh";
        c2.requirment="salt";
        c2.cost=30;

        c3.id=3;
        c3.name="jonh";
        c3.requirment="cake";
        c3.cost=150;

        c4.id=4;
        c4.name="murfy";
        c4.requirment="egg";
        c4.cost=60;
        Customer customer[]=new Customer[4];
        customer[0]=c1;
        customer[1]=c2;
        customer[2]=c3;
        customer[3]=c4;
//        for(int i=0;i< customer.length;i++) {
//            System.out.println("name => "+customer[i].name+" cust => "+customer[i].cost+" requirment => "+customer[i].requirment);
//        }

        //Enhanshed for loop or for each loop
        for (Customer cust :customer)
            System.out.println("name => " + cust.name + " cust => " + cust.cost + " requirment => " + cust.requirment);
    }
}
