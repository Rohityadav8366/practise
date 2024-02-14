package Lanbda;
@FunctionalInterface
interface rohit{
    public void display();
}
public class LambdaExptn {
    public static void main(String[] args) {
    rohit r=()->{
        System.out.println("hello rohit");

    };
    r.display();
    }
}
