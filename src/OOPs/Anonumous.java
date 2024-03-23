package OOPs;
class A
{
    public void show()
    {
        System.out.println("In A show");
    }
}
class B extends A
{

   public void show()
    {
        System.out.println("In B show");
    }

}
public class Anonumous {
    public static void main(String[] args) {
        A obj = new B();
        obj.show();
        obj.show();
    }
}