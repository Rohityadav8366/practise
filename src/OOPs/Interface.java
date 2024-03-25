package OOPs;
@FunctionalInterface
interface Lambda
{
   // void show();
    void show1(int i,int j);
}
public class Interface {
    public static void main(String[] args) {
        //Ananumous class are define
//         Lambda obj=new Lambda() {
//             @Override
//             public void show() {
//                 System.out.println("this is the ananumous class");
//             }
//         };
//        Lambda obj=()->{
//            System.out.println("this is the lambda expresstion ");
//        };
   //     Lambda obj1=() -> {System.out.println("this is the Second way to using Lambda expression:");};
//         obj.show();
//         obj1.show();
         Lambda obj2=(int i,int j)->{ System.out.println("this is the way we use parenthesis "+i +" "+j);};
         obj2.show1(2,3);
    }
}
