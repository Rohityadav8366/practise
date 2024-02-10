package JavaCollection;

import java.util.ArrayList;
import java.util.List;

public class Arraylist {
    public static void main(String[] args) {
        ArrayList<Integer> al1=new ArrayList<>(10);
        ArrayList<Integer> al2=new ArrayList<>(List.of(20,1,40,50));
        al1.add(20);
        al1.add(1,34);
        al1.add(32);
        al1.addAll(al2);
        System.out.println(al1.contains(20));
        System.out.println(al1);
        System.out.println(al2);
    }
}
