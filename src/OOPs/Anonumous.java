package OOPs;
abstract class A
{
    public abstract void show();
    public void name(){
        System.out.println("rohit");
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
        //Dynamic methode dispatch
        A obj = new B()
        {
            public void show(){
                System.out.println("Annonumous class");
            }
        };
        obj.show();
        obj.name();
    }
}