package string;

public class Str {
    public static void main(String[] args) {

        String name = "rohit";
        String name1 = "rohit";
        String name2 = new String("rohit");
        if(name==name1){
            System.out.println("both are same");
            System.out.println("rohit yadav mai ");
        }
        if(name1.equals(name2))
        {
            System.out.println("this is for value comparition");
            System.out.println(" value both are same");
        }
        else {
            System.out.println("both are not same");
        }
    }
}
